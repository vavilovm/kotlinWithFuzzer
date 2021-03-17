// Bug happens on JVM 
//File: tmp/tmp0.kt

fun box()  {
val f:Any
val b:Any = TODO()
({var n = when (val k = f) {}})
}
