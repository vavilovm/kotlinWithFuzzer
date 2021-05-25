// PSI ERROR. Modified in 12
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  open class Range(val from : C, val to: C) {
//     operator fun iterator() = It(from, to)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// class It(val from: C, val to: C) {
//     internal var c = from.i
// 
//     operator fun next(): C {
//         val next = C(c)
//         c++
//         return next
//     }
// 
//     tailrec operator fun hasNext(): Boolean = c <= to.i
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// class C(val i : Int) {
//     operator fun component1() = i + 1
//     operator fun component2() = i + 2
//     operator fun rangeTo(c: C) = Range(this, c)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun doTest(): String {
//     var s = ""
//     for ((a, _) in C(0)..C(2)) {
//         s += "$a;"
//     }
// 
//     for ((_, b) in C(1)..C(3)) {
//         s += "$b;"
//     }
// 
//     for ((_, `_`) in C(2)..C(4)) {
//         s += "$`_`;"
//     }
// 
//     return s
// }
// 
// fun box(): String {
//     val s = doTest()
//     return if (s == "1;2;3;3;4;5;4;5;6;") {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail: $s"
// }
// }
// 

 open class Range {
    val from:Cval to:Cconstructor(  from: C,   to: C) {
this.from = from
this.to = to
}operator fun iterator() = It(from, to)
override fun toString(): String{
var res = ""
return res
}}

class It(val from: C, val to: C) {
    internal var c = from.i

    operator fun next(): C {
        val next = C(c)
        c++
        return next
    }

    tailrec operator fun hasNext(): Boolean = c <= to.i
override fun toString(): String{
var res = ""
return res
}}

class C(val i : Int) {
    operator fun component1() = i + 1
    operator fun component2() = i + 2
    operator fun rangeTo(c: C) = Range(this, c)
override fun toString(): String{
var res = ""
return res
}}

tailrec fun doTest(): String {
    var s = ""
    for ((a, _) in C(0)..C(2)) {
        s += "$a;"
    }

    for ((_, b) in C(1)..C(3)) {
        s += "$b;"
    }

    for ((_, `_`) in C(2)..C(4)) {
        s += "$`_`;"
    }

    return s
}

fun box(): String {
    val s = doTest()
    return if (s == "1;2;3;3;4;5;4;5;6;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $s"
}
}

