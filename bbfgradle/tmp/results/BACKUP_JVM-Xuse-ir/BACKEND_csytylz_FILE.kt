// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp.kt


class Kl1 {
    val prop3: Int
    constructor() {
        if (true) 
            null!!.toString().length = 1
prop3 = 1
    }
}

