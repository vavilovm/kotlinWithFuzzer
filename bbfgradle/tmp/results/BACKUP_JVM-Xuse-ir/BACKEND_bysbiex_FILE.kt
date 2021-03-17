// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class A
fun varargToElement(f: (A, Int
) -> CharSequence): Any = TODO()
fun box()   =
varargToElement(A::foo)
fun Any.foo(vararg xs: Int ): CharSequence = TODO()
