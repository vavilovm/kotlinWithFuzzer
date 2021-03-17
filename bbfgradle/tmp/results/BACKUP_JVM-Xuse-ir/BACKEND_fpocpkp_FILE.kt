// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

class Foo {
val d by DelegateFactory()
}
class DelegateFactory {
    operator fun provideDelegate(
thisRef: Any,prop: Any
): Delegate = TODO()
}
class Delegate(val default: Int) {
operator fun getValue(
thisRef: Any,prop: Any
) =
        default
}
fun box()  {
    val x = Foo()
    x.d = throw AssertionError()
}
