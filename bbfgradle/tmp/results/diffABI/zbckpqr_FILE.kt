// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

      fun box(): String =TODO()
// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// IGNORE_BACKEND: NATIVE
class MySet : HashSet<Int>() {
    override fun remove(element: Int): Boolean =TODO()
}
fun box(a: Any =""):Unit = TODO()
public open class TODO//inspired by kt3492
// !LANGUAGE: +InlineClasses
(val x: String)
// WITH_RUNTIME
//KT-3276
// JVM_TARGET: 1.8
