// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


inline class S(val s: Int) {
    companion object {
        var s: Int = TODO()
}
}

