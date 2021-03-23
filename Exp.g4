grammar Exp;

/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
symbol_table = []
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

PRINT: 'print' ;

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
    }
    ( statement )+
    {
print('    return')
print('.limit stack 10')
print('.limit locals', len(symbol_table))
print('.end method')
print('\n; symbol_table:', symbol_table)
    }
    ;

statement: st_print | st_attrib ;

st_print: PRINT OP_PAR
    {
print('    getstatic java/lang/System/out Ljava/io/PrintStream;')
    }
    expression CL_PAR
    {
print('    invokevirtual java/io/PrintStream/println(I)V\n')
    }
    ;

st_attrib: NAME ATTRIB expression 
    {
# testar se a variável existe
if $NAME.text not in symbol_table:
    symbol_table.append($NAME.text)

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
print('    iload', index)
    }
    ;

