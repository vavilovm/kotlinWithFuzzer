// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface A {
    fun foo() = TODO
}
interface B : A
interface C : Int {
fun foo() = Impl()
.foo
}
interface D : C, B
class Impl : D
