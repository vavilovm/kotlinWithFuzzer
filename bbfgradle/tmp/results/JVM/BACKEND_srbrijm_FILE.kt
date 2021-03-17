// Bug happens on JVM 
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt

class A {
    open inner class AB 
}
fun A.foo()  {
    class FooC : A.AB()
}

