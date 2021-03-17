// Bug happens on JVM , JS 
// IGNORE_BACKEND: JS
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

open class Base {
    open fun setup() {}
    init { setup() }
}

class Derived : Base {
    constructor() : super()
    override fun setup() { x = 1 }

    // Technically, this field initializer comes after the superclass
    // constructor is called. However, we optimize away field initializers
    // IGNORE_BACKEND_FIR: JVM_IR
    // IGNORE_BACKEND: JS
    var x = 0
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box(): String = if (Derived().x == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail"
}

class Kla0 {
  operator fun Int.component1() = this + 1
  operator fun Int.component2() = this + 2
}

fun Kla0.fu0(): String {
    var prope0 = ""
    for ((Ty0, Ty1) in 0.rangeTo(2)) {
            return "Fail: should throw on get() in loop header"
        }
    return "OK"
}

fun box602(): String {
  val prope0 = Kla0().fu0()
  return if (prope0 == "Fail 2") {
println("""THEN""");
return "fail 1"
} else {
println("""ELSE""");
"fail"
}
}

class Kla1(val prope1: Int) {
    object Kla2 {
        fun fu1(): Int = 4
        val prope2 = 5
    }
    object Kla3 {
    }

    constructor() : this(Kla2.fu1() + Kla2.prope2)
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun box642(): String {
    val prope1 = Kla1().prope1
    if (prope1 != 9) {
println("""THEN""");
return "T$prope1"
}
    return "OK"
}


