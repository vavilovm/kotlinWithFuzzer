// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box()  {
val state:Any = TODO()
({}?.let { state = 1 })
}
