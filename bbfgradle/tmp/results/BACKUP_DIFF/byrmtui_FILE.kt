// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

fun f0(par1: Double )  =
    ""
fun f0(par1: Int? )  =
"Fail"
fun box()  = f0(1 )
