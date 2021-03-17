interface B : C
interface C : A
interface A {
    fun foo() = Impl().foo
}
interface D : A, B
class Impl : D