// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

val result = A()
.result()
class A {
    inner class Inner {
        val o = 1
}
fun result() = (A::Inner )(TODO()).o
}
fun box()  {
val o:Any = TODO()
result++
}
