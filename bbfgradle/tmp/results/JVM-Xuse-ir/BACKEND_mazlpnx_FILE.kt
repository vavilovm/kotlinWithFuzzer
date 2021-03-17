// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


enum class E {
    inline
    E1 {
        fun foo() = ""
    }
}

