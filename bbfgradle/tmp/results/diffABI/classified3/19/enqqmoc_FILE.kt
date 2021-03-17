// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +JvmFieldInInterface
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class Bar(val value: String)

interface  Foo {

    companion object {
        @JvmField
        val z = Bar("OK")
    }
}


fun box(): String {
    val field = Foo.Companion::z
    return field.get().value
}
