// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Foo {
    fun foo(init: Double = 1.1) 
}
interface FooChain: Foo
class Impl {
    fun foo(a: Double) = FooImpl()
.foo
}
class FooImpl : FooChain, Impl
