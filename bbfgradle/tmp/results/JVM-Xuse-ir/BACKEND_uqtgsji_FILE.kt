// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


interface ITest {
    var test: S
}
class M
 : ITest {
    override var test: S
        get() = TODO()
        set(TODO) {
            TODO = TODO()
        }
}
class S
 : ITest {
    override var test: S
        get() = TODO()
        set(value) {}
}

