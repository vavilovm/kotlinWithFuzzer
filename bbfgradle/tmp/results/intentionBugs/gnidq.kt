// COMPILE != OK. Modified in 532
// MODIFIED by Convert lambda expression to anonymous function intention:
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

tailrec infix fun <T, R> T.bar(f: (T) -> R) = f(this)

fun box(): String {
    "rrr".foo { A(it) } += "aaa"

    if (log != "init(rrr);pp = rrraaa;") {
println("""THEN""");
return "1: log = \"$log\""
}

    log = ""
    "foo".bar(fun(): A {
    return A(it)
}) += "baaar"

    if (log != "init(foo);pp = foobaaar;") {
println("""THEN""");
return "2: log = \"$log\""
}

    return "OK"
}
