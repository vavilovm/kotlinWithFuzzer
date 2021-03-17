// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt


class Delegate {
    operator fun getValue( t: Any?,p: Any): Int = TODO()
}
inline class Kla1(val default: Int) {
fun getValue() {
        val prop: Int by Delegate()
}
}

