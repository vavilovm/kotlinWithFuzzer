// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

enum class E {
    inline
    E1 {
fun invoke() = 1
}
}
