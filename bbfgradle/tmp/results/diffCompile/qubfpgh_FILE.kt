// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

class A {
    @JvmField
    val x = ""
companion object {
        val x = ""
    }
}
