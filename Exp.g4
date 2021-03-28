grammar Exp;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
import sys
symbol_table = []
variables_used = []
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

PRINT   : 'print' ;
READ_INT: 'read_int' ;

NUMBER: '0'..'9'+ ;

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
symbol_table.append('args')
variables_used.append(True)
    }
    ( statement )+
    {
print('    return')
print('.limit stack 10')
print('.limit locals', len(symbol_table))
print('.end method')
print('\n; symbol_table:', symbol_table)
if False in variables_used:
    var_index = variables_used.index(False)
    raise Exception("Variable '" + symbol_table[var_index] + "' declareted but not used")
    }
    ;

statement: st_print | st_attrib ;

st_print: PRINT OP_PAR
    {
print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    }
    expression
    {
print('    invokevirtual java/io/PrintStream/println(I)V\n')
    }
    ( COMMA
    {
print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    } 
    expression 
    {
print('    invokevirtual java/io/PrintStream/println(I)V\n')
    }
    )*
    CL_PAR
    {
print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
print('    invokevirtual java/io/PrintStream/println()V\n')
    }
    ;

st_attrib: NAME ATTRIB expression 
    {
# testar se a variável existe
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)
    variables_used.append(False)

# encontrar o index de $NAME.text e gerar bytecode
index = symbol_table.index($NAME.text)
print('    istore', index, '\n')
    }
    ;

expression: term ( op = ( PLUS | MINUS ) expression
    {
if $op.type == ExpParser.PLUS : print('    iadd')
if $op.type == ExpParser.MINUS: print('    isub')
    }
    )? ;

term: factor ( op = ( TIMES | OVER | REM ) term
    {
if $op.type == ExpParser.TIMES : print('    imul')
if $op.type == ExpParser.OVER  : print('    idiv')
if $op.type == ExpParser.REM   : print('    irem')
    }
    )? ;

factor: NUMBER
    {
print('    ldc ' + $NUMBER.text)
# symbol_table.append($NUMBER.text)
    } 
    | OP_PAR expression CL_PAR 
    | NAME
    {
index = symbol_table.index($NAME.text)
variables_used[index] = True
print('    iload', index)
    }
    | READ_INT OP_PAR CL_PAR
    {
print('     invokestatic Runtime/readInt()I')
    }
    ;

