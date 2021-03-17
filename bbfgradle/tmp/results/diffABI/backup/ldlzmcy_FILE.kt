// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

fun String.bar(): String {
    open class Local {
        fun result() = this@bar
    }

    class Outer {
        inner class Inner : Local() {
            fun outer() = this@Outer
        }
    }

    return Outer().Inner().result()
}

fun box() = "OK".bar()
