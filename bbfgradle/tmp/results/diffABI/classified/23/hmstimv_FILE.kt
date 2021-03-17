// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Test {
    private var i : Int
        get() = 1
        set(i) {}

    fun foo() {
        fun f() {
            i = 2
        }
        f()
    }
}

fun box(): String {
    Test().foo()
    return "OK"
}
