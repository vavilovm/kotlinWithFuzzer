// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Foo {
    fun bar(): String {
        fun <T> foo(t:() -> T) : T = t()
        foo { }
        return "OK"
    }
}

fun box(): String {
    return Foo().bar()
}
