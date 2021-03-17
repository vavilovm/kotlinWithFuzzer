// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: -ProperForInArrayLoopRangeVariableAssignmentSemantic
// WITH_RUNTIME
// IGNORE_BACKEND: NATIVE
// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

fun box(): String {
    var xs = intArrayOf(1, 2, 3)
    var sum = 0
    for (x in xs) {
        sum = sum * 10 + x
        xs = intArrayOf(4, 5)
    }
    return if (sum == 15) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail: $sum"
}
}

inline class Kl0(private val par1: Int) {
    fun f2(): String = if (par1 == -1934674326) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
override fun toString(): String{
var res = ""
res += par1.toString()
return res
}}

fun f0(): Kl0 {
    var xs = intArrayOf(1, 2, 3)
var sum = 0
val prop0 = Kl0((intArrayOf(1, 2)).elementAtOrElse(-sum, {a: Int -> -1})) ?: null
    return f1(prop0)
}

fun f1(par0: Kl0?) = par0!!

fun box117(): String {
    var xs = intArrayOf(1, 2, 3)
var sum = 0
return f0().f2()
}


