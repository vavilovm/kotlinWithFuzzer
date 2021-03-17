// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box1() : Any {
val s = (return "").plus(A())
}
class A
