// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


fun box(x: String)  {
val i:Any = TODO()
x += i
}
