// COMPILE != OK. Modified in 365
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
//  var log = ""
// 
// class A(p: String) {
//     var pp = p
// 
//     init {
//         log += "init($p);"
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// operator fun A.plusAssign(s: String) {
//     pp += s
//     log += "pp = $pp;"
// }
// 
// inline fun <T, R> T.foo(f: (T) -> R) = f(this)
// 
// infix fun <T, R> T.bar(f: (T) -> R) = f(this)
// 
// fun box(): String {
//     "rrr".foo { A(it) } += "aaa"
// 
//     if (log != "init(rrr);pp = rrraaa;") {
// println("""THEN""");
// return "1: log = \"$log\""
// }
// 
//     log = ""
//     "foo".bar { A(it) } += "baaar"
// 
//     if (log != "init(foo);pp = foobaaar;") {
// println("""THEN""");
// return "2: log = \"$log\""
// }
// 
//     return "OK"
// }

 var log = ""

class A(p: String) {
    var pp = p

    init {
        log += "init($p);"
    }
override fun toString(): String{
var res = ""
return res
}}

operator fun A.plusAssign(s: String) {
    pp += s
    log += "pp = $pp;"
}

inline fun <T, R> T.foo(f: (T) -> R) = f(this)

infix fun <T, R> T.bar(f: (T) -> R) = f(this)

fun box(): String {
    val a = A(it)
 "rrr".foo { a } += "aaa"

    if (log != "init(rrr);pp = rrraaa;") {
println("""THEN""");
return "1: log = \"$log\""
}

    log = ""
    "foo".bar { a } += "baaar"

    if (log != "init(foo);pp = foobaaar;") {
println("""THEN""");
return "2: log = \"$log\""
}

    return "OK"
}
