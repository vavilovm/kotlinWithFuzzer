// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.Number
enum class A1(val prop1: String) {
    X("asd"),
    Y() {
        override fun f():String = TODO()
    },
    Z(5);

    val prop2: String = "const2"
    var prop3: String = ""

    constructor(): this("default") {
        prop3 = "empty"
    }
    constructor(x: Int): this(x.toString()) {
        prop3 = "int"
    }

    open fun f(): String = TODO()
}

enum class A2 {
    X("asd"),
    Y() {
        override fun f():String = TODO()
    },
    Z(5);

    val prop1: String
    val prop2: String = "const2"
    var prop3: String = ""

    constructor(arg: String) {
        prop1 = arg
    }
    constructor() {
        prop1 = "default"
        prop3 = "empty"
    }
    constructor(x: Int): this(x.toString()) {
        prop3 = "int"
    }

    open fun f(): String = TODO()
}

fun box(): String =TODO()

private abstract class A(val nu: A1, val uj: ArrayDeque<A1> = ArrayDeque<A1>()): Number(){

override fun toByte(): kotlin.Byte = TODO()

override fun toChar(): kotlin.Char = TODO()

override fun toDouble(): kotlin.Double = TODO()

val psjdd: Boolean = TODO()

}


