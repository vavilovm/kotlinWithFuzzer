// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
interface I {
val foo = A()
.foo
}
interface J : I
class A : I, J
