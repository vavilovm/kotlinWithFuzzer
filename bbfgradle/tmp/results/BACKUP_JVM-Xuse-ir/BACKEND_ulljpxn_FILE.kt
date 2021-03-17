// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun foo(): Int = TODO()
fun box()  {
    val javaClass = foo().javaClass
javaClass!! != 2L.javaClass
}
