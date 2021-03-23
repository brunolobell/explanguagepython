.source Test.src
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc 2
    istore 1 

    ldc 4
    istore 1 

    ldc 6
    istore 2 

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    iload 2
    iadd
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit stack 10
.limit locals 3
.end method

; symbol_table: ['args', 'a', 'b']
