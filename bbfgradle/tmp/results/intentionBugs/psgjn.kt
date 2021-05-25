// COMPILE != OK. Modified in 327
// MODIFIED by Convert receiver to parameter intention:
// ORIGINAL CODE:
//  private var log = ""
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
// infix operator fun A.plusAssign(s: String) {
//     pp += s
//     log += "pp = $pp;"
// }
// 
// inline infix fun <T, R> T.foo(f: (T) -> R) = f(this)
// 
// tailrec infix fun <T, R> T.bar(f: (T) -> R) = f(this)
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

 private var log = ""

class A(p: String) {
    var pp = p

    init {
        log += "init($p);"
    }
override fun toString(): String{
var res = ""
return res
}}

infix operator fun A.plusAssign(s: String) {
    pp += s
    log += "pp = $pp;"
}

inline infix fun <T, R> T.foo(f: (T) -> R) = f(this)

tailrec infix fun <T, R> bar(t: T, f: (T) -> R) = f(t)

fun box(): String {
    "rrr".foo { A(it) } += "aaa"

    if (log != "init(rrr);pp = rrraaa;") {
println("""THEN""");
return "1: log = \"$log\""
}

    log = ""
    "foo".bar { A(it) } += "baaar"

    if (log != "init(foo);pp = foobaaar;") {
println("""THEN""");
return "2: log = \"$log\""
}

    return "OK"
}
