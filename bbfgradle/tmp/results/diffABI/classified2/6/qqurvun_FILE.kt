// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

@Retention(AnnotationRetention.RUNTIME)
annotation class Simple(val value: String)

@property:Simple("OK")
val foo: Int = 0

fun box(): String {
    return (::foo.annotations.single() as Simple).value
}
