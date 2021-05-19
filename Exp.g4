grammar Exp;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
import sys
symbol_table = []
variables_used = []
while_table = []
types = {}
stack_cur = 0
stack_max = 0
if_count = 0
elif_count = 0
while_count = 0
def emit(bytecode, delta, End='\n'):
    global stack_cur
    global stack_max
    print(bytecode, end=End)
    stack_cur += delta
    if stack_cur > stack_max:
        stack_max = stack_cur
}

/*---------------- LEXER RULES ----------------*/
COMMENT: '#' ~('\n')*          -> skip ;
SPACE  : (' '|'\t'|'\r'|'\n')+ -> skip ;

PLUS  : '+' ;
MINUS : '-' ;
TIMES : '*' ;
OVER  : '/' ;
REM   : '%' ;
OP_PAR: '(' ;
CL_PAR: ')' ;
ATTRIB: '=' ;
COMMA : ',' ;
OP_CUR: '{' ;
CL_CUR: '}' ;
OP_BRA: '[' ;
CL_BRA: ']' ;
EQ    : '==' ;
NE    : '!=' ;
GT    : '>'  ;
GE    : '>=' ;
LT    : '<'  ;
LE    : '<=' ;
DOT   : '.' ;

PRINT   : 'print' ;
READ_INT: 'read_int' ;
READ_STR: 'read_str' ;
IF      : 'if' ;
ELSE    : 'else' ;
ELIF    : 'elif' ;
WHILE   : 'while' ;
BREAK   : 'break' ;
CONTINUE: 'continue' ;
LENGTH  : 'length' ;
PUSH    : 'push' ;

NUMBER: '0'..'9'+ ;
STRING: '"'~('"')*'"' ;

NAME: 'a'..'z'+ ;

/*---------------- PARSER RULES ----------------*/

program:
    {
print('.source Test.src')
print('.class  public Test')
print('.super  java/lang/Object\n')
print('.method public <init>()V')
print('    aload_0')
print('    invokenonvirtual java/lang/Object/<init>()V')
print('    return')
print('.end method\n')
    }
    main ;

main: 
    {
print('.method public static main([Ljava/lang/String;)V\n')
    }   
    ( statement )+
    {
print('    return')
print('    .limit stack ' + str(stack_max))
if len(symbol_table) > 0:
    print('    .limit locals', len(symbol_table))
print('.end method')
print('\n; symbol_table:', symbol_table)
if False in variables_used:
    var_index = variables_used.index(False)
    print("Variable '" + symbol_table[var_index] + "' declareted but not used", file=sys.stderr)
    sys.exit(1)
    }
    ;

/*------------------------------- STATEMENTS ------------------------------- */

statement: st_print | st_attrib | st_if | st_while | st_break | st_continue | st_array_new | st_array_push | st_array_attrib;

/*------------------------------- PRINT ------------------------------- */

st_print: PRINT OP_PAR
    {
emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
    }
    e1 = expression
    {
if $e1.type == 'i':
    emit('    invokevirtual java/io/PrintStream/println(I)V\n', -2)
elif $e1.type == 's':
    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n', -2)
elif $e1.type == 'a':
    emit('    invokevirtual Array/string()Ljava/lang/String;\n', 0)
    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V', -2)
else:
    emit('    Error in Compiler', -2)
    }
    ( COMMA
    {
emit('    getstatic java/lang/System/out Ljava/io/PrintStream;', 1)
    } 
    e2 = expression 
    {
if $e2.type == 'i':
    emit('    invokevirtual java/io/PrintStream/println(I)V\n', -2)
elif $e2.type == 's':
    emit('    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n', -2)
elif $e2.type == 'a':
    emit('invokevirtual Array/string()Ljava/lang/String;\n', 0)
    emit('invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V', -2)
else:
    print('ERROR TYPE', file=sys.stderr)
    }
    )*
    CL_PAR
    {
# print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
# print('    invokevirtual java/io/PrintStream/println()V\n')
    }
    ;

/*------------------------------- ATTRIB -------------------------------*/

st_attrib returns [type]: NAME ATTRIB ex = expression 
    {
# testar se a variável existe
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)
    variables_used.append(False)
    types[$NAME.text] = $ex.type

# encontrar o index de $NAME.text e gerar bytecode
index = symbol_table.index($NAME.text)
my_type = types[$NAME.text]
if my_type != $ex.type:
    if my_type == 'i':
        print("Variable '{}' must receive an integer".format($NAME.text), file=sys.stderr)
        sys.exit(1)
    elif my_type == 's':
        print("Variable '{}' must receive a string".format($NAME.text), file=sys.stderr)
        sys.exit(1)
    elif my_type == 'a':
        print("Variable '{}' must receive a array".format($NAME.text), file=sys.stderr)
        sys.exit(1)
$type = my_type
if my_type == 'i':
    emit('    istore ' + str(index) + '\n', 1)
elif my_type == 's' or my_type == 'a':
    emit('    astore ' + str(index) + '\n', 1)
else:
    print("Error", file=sys.stderr)
    sys.exit(1)
    }
    ;

/*------------------------------- ARRAY ------------------------------- */

/*--------- NEW --------*/

st_array_new returns [type]: NAME ATTRIB OP_BRA CL_BRA
    {
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)
    variables_used.append(False)
    types[$NAME.text] = 'a'
index = symbol_table.index($NAME.text)
$type = types[$NAME.text]
emit('    new Array', +1)
emit('    dup', +1)
emit('    invokespecial Array/<init>()V', -1)
emit('    astore ' + str(index) + '\n', 1)
    }
    ;

/*------- PUSH -------*/

st_array_push returns [type]: NAME DOT PUSH OP_PAR
    {
index = symbol_table.index($NAME.text)
my_type = types[$NAME.text]
if(my_type == 'a'):
    emit('    aload ' + str(index), 1)
else:
    print("Can't push into non array", file=sys.stderr)
    sys.exit(1)
    } ex = expression CL_PAR
    {
if($ex.type != 'i'):
    print("Element must be integer", file=sys.stderr)
    sys.exit(1)
emit('    invokevirtual Array/push(I)V\n', -2)
$type = 'i'
    }
    ;

/*------- ATTRIB -------*/

st_array_attrib returns [type]: NAME OP_BRA
    {
index = symbol_table.index($NAME.text)
my_type = types[$NAME.text]
if my_type != 'a':
    print("{} not is an array".format($NAME.text), file=sys.stderr)
    sys.exit(1)
emit('    aload ' + str(index) + '\n', 1)
    } ex1 = expression CL_BRA ATTRIB ex2 = expression
    {
if $ex1.type != 'i' or $ex2.type != 'i':
    print("Two expressions must be integer", file=sys.stderr)
    sys.exit(1)
emit('    invokevirtual Array/set(II)V\n', -3)
$type = my_type
    }
    ;

/*------------------------------- WHILE -------------------------------*/

/*------- BREAK -------*/

st_break: BREAK
    {
global while_count
while_local = while_count - 1
if len(while_table) == 0:
    print('Break without while!', file=sys.stderr)
    sys.exit(1)
print('    goto END_WHILE_' + str(while_local))
    }
    ;

/*------- CONTINUE -------*/

st_continue: CONTINUE
    {
global while_count
while_local = while_count - 1
if len(while_table) == 0:
    print('Continue without while!', file=sys.stderr)
    sys.exit(1)
print('    goto BEGIN_WHILE_' + str(while_local))
    }
    ;

/*------- WHILE ------- */

st_while: WHILE
    {
global while_count
while_local = while_count
while_count += 1
while_table.append(1)
print('BEGIN_WHILE_' + str(while_local) + ':')
    }
comparison
    {
print('END_WHILE_' + str(while_local))
    }
OP_CUR ( statement )+ CL_CUR
    {
print('    goto BEGIN_WHILE_' + str(while_local))
print('END_WHILE_' + str(while_local) + ':')
while_table.pop()
    }
    ;    

/*------------------------------- IF ------------------------------- */
/*------- IF ------- */
st_if: IF comparison
    {
global if_count
global elif_count
if_local = if_count
if_count += 1
elif_local = -1
print('NOT_IF_' + str(if_local))
    }
OP_CUR ( statement )+ CL_CUR
    (
    {
print('    goto NOT_ELIF_' + str(elif_count))
if elif_local != -1: 
    print('NOT_ELIF_' + str(elif_local) + ':')
else:
    print('NOT_IF_' + str(if_local) + ':')
elif_local = elif_count
elif_count += 1
    }
/*------- ELIF -------*/
ELIF comparison
    {
print('NOT_ELIF_' + str(elif_local))
    }
OP_CUR ( statement )+ CL_CUR
    )*
    (
    {
print('    goto END_ELSE_' + str(if_local)) 
if elif_local != -1: 
    print('NOT_ELIF_' + str(elif_local) + ':')
else: 
    print('NOT_IF_' + str(if_local) + ':')
    }
/*------- ELSE -------*/
ELSE OP_CUR ( statement )+ CL_CUR
    {
print('END_ELSE_' + str(if_local) + ':')
    }
    | 
    { 
if elif_local != -1: 
    print('NOT_ELIF_' + str(elif_local) + ':')
else: 
    print('NOT_IF_' + str(if_local) + ':')
    }
    )
    ;

/*------- COMPARISON -------*/
comparison: ex1 = expression op = ( EQ | NE | GT | GE | LT | LE ) ex2 = expression
    {
if $ex1.type != $ex2.type:
    print("cannot mix types", file=sys.stderr)
    sys.exit(1)
if $op.type == ExpParser.EQ : emit('   if_icmpne', -2, " ")
if $op.type == ExpParser.NE : emit('   if_icmpeq', -2, " ")
if $op.type == ExpParser.GT : emit('   if_icmple', -2, " ")
if $op.type == ExpParser.GE : emit('   if_icmplt', -2, " ")
if $op.type == ExpParser.LT : emit('   if_icmpge', -2, " ")
if $op.type == ExpParser.LE : emit('   if_icmpgt', -2, " ")
    }
    ;

/*------------------------------- EXPRESSION -------------------------------*/

expression returns [type]: t1 =  term ( op = ( PLUS | MINUS ) ex2 = expression
    {
if $t1.type != $ex2.type:
    print("cannot mix types", file=sys.stderr)
    sys.exit(1)
if $op.type == ExpParser.PLUS : emit('    iadd', -1)
if $op.type == ExpParser.MINUS: emit('    isub', -1)
    }
    )? 
    {
$type = $t1.type
    }
    ;

/*------------------------------- TERM -------------------------------*/

term returns [type]: f1 = factor ( op = ( TIMES | OVER | REM ) t1 = term
    {
if $t1.type != $f1.type:
    print("cannot mix types", file=sys.stderr)
    sys.exit(1)
if $t1.type != 'i':
    print("Must be a integer", file=sys.stderr)
    sys.exit(1)
if $op.type == ExpParser.TIMES : emit('    imul', -1)
if $op.type == ExpParser.OVER  : emit('    idiv', -1)
if $op.type == ExpParser.REM   : emit('    irem', -1)
    }
    )* 
    {
$type = $f1.type
    }    
    ;

/*------------------------------- FACTOR -------------------------------*/

factor returns [type] : 
/*------- NUMBER -------*/
    NUMBER
    {
emit('    ldc ' + $NUMBER.text, 1)
$type = 'i'
    }
/*------- STRING -------*/
    | STRING
    {
emit('    ldc ' + $STRING.text, 1)
$type = 's'
    }
/*------- EXPRESSION REPRESENTATION -------*/
    | OP_PAR expression CL_PAR
    {
$type = $expression.type
    }
/*------- VARIABLE -------*/
    | NAME
    {
if $NAME.text not in symbol_table:
    print("{} is not declared".format($NAME.text), file=sys.stderr)
    sys.exit(1)
index = symbol_table.index($NAME.text)
variables_used[index] = True
$type = types[$NAME.text]
if $type == 'i':
    emit('    iload ' + str(index), 1)
elif $type == 's':
    emit('    aload ' + str(index), 1)
elif $type == 'a':
    emit('    aload ' + str(index), 1)
else:
    print("Err", file=sys.stderr)
    sys.exit(1)
    }
/*------- READ INTEGER -------*/    
    | READ_INT OP_PAR CL_PAR
    {
emit('    invokestatic Runtime/readInt()I', 1)
$type = 'i'
    }
/*------- READ STRING -------*/
    | READ_STR OP_PAR CL_PAR
    {
emit('    invokestatic Runtime/readString()Ljava/lang/String;', 1)
$type = 's'
    }
/*------- ARRAY -------*/
    | NAME
    {
index = symbol_table.index($NAME.text)
variables_used[index] = True
$type = types[$NAME.text]
if $type != 'a':
    print("Can't access index of non array", file=sys.stderr)
    sys.exit(1)
emit('    aload ' + str(index), 1)
    }
    OP_BRA ex = expression
    {
if($ex.type == 'i'):
    emit('    invokevirtual Array/get(I)I', -1)
    $type = 'i'
else:
    print("Array index must be integer", file=sys.stderr)
    sys.exit(1)
    }
    CL_BRA
/*------- LENGTH -------*/    
    | NAME DOT LENGTH
    {
index = symbol_table.index($NAME.text)
variables_used[index] = True
$type = types[$NAME.text]
if($type == 'a'):
    emit('    aload ' + str(index), 1)
    emit('    invokevirtual Array/length()I', 0)
    $type = 'i'
else:
    print('Type must be array', file=sys.stderr)
    sys.exit(1)
    }
    ;