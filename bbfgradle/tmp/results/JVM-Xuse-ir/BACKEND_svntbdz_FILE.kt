// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt


object Host {
var y = 1
var yy: Int
        @JvmStatic
get() = y
        set(value) {}
}
val c_yy = Host::yy

