// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class A {
    private fun foo() = TODO
}
class C : A
(C::foo!!.isOptional )
