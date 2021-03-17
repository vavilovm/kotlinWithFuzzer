// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun fn1():Int = TODO()
val fns = arrayOf<Any>((::fn1)!!
                       )
