// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface IFoo {
val ok: Int
}
class Test
 : IFoo by TODO()

