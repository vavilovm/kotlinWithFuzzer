// Bug happens on JVM 
//File: tmp/tmp0.kt

class A {
    open inner class AB 
}
fun A.foo()  {
    class FooC : A.AB()
}
