// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

private interface A<in T> {
    private fun f(): T = TODO()
}
