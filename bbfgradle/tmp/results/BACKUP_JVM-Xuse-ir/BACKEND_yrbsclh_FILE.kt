// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun addFoo()  {
val s:Any = TODO()
when (s) {
 1 until 1u -> {}
}
}
