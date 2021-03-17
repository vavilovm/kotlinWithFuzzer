// Bug happens on JVM 
//File: tmp/tmp0.kt

class A {
    private fun foo() = TODO
}
class C : A
(C::foo!!.isOptional )
