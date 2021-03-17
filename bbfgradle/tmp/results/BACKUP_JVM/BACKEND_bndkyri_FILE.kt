// Bug happens on JVM 
//File: tmp/tmp0.kt

class A
val Any.ext: Any
get() {
return A()
    }
fun box()  {
(A::ext)!!()
}
