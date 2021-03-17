// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

interface Base
fun interface F : Base {
    fun invoke(String: String)
}
fun box(): Any {
return ""
F {  x-> x += 1u
}
} 
 
