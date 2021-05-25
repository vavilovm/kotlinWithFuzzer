// PSI ERROR. Modified in 48
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class Name(private val value: String) {
//     fun asValue(): String = value
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun concat(a: Name, b: Name) = a.asValue() + b.asValue()
// 
// private inline class UInt(private val value: Int) {
//     fun asValue(): Int = value
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val o = inlinedRun {
//         Name("O")
//     }
// 
//     val k = notInlinedRun {
//         Name("K")
//     }
// 
//     if (concat(o, k) != "OK") {
// println("""THEN""");
// return "fail 1"
// }
// 
//     val a = UInt(1)
//     val one = inlinedRun {
//         a
//     }
// 
//     if (one.asValue() != 1) {
// println("""THEN""");
// return "fail 2"
// }
// 
//     val b = UInt(2)
//     val two = notInlinedRun {
//         b
//     }
// 
//     if (two.asValue() != 2) {
// println("""THEN""");
// return "fail 3"
// }
// 
//     return "OK"
// }
// 
// tailrec inline fun <R> inlinedRun(block: () -> R): R = block()
// fun <R> notInlinedRun(block: () -> R): R = block()

// !LANGUAGE: +InlineClasses

inline class Name(  value: String) {
    private val value = valuefun asValue(): String = value
override fun toString(): String{
var res = ""
return res
}}

fun concat(a: Name, b: Name) = a.asValue() + b.asValue()

private inline class UInt(private val value: Int) {
    fun asValue(): Int = value
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val o = inlinedRun {
        Name("O")
    }

    val k = notInlinedRun {
        Name("K")
    }

    if (concat(o, k) != "OK") {
println("""THEN""");
return "fail 1"
}

    val a = UInt(1)
    val one = inlinedRun {
        a
    }

    if (one.asValue() != 1) {
println("""THEN""");
return "fail 2"
}

    val b = UInt(2)
    val two = notInlinedRun {
        b
    }

    if (two.asValue() != 2) {
println("""THEN""");
return "fail 3"
}

    return "OK"
}

tailrec inline fun <R> inlinedRun(block: () -> R): R = block()
fun <R> notInlinedRun(block: () -> R): R = block()
