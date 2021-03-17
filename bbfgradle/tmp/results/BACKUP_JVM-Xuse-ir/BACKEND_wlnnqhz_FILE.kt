// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

class A {
    inner class Inner {
val o = 1
}
}
fun box()   =
fun A.
() = (A::Inner)(TODO()).o.plus((
::Inner)!!.k)
