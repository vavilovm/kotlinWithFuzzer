// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

interface Base
fun interface F : Base {
    fun invoke(o: Any) 
}
fun box()  {
val lambda: Int = TODO()
F {  o-> o = ""
}.run {}
}
