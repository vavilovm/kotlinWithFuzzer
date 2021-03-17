// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box1()   =
Int::p1.call()::mp1.call()
val Int.p1: Int get() = this
var Int.mp1: Int
    get() = this
    set(value) {}
