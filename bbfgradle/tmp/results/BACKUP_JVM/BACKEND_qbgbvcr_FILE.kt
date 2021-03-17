// Bug happens on JVM 
//File: tmp/tmp0.kt

fun addFoo()  {
val s:Any = TODO()
when (s) {
 1u in 1 until 1u -> {}
}
}
