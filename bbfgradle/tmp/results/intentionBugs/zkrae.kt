// PSI ERROR. Modified in 26
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  var log = ""
// 
// open class Base(val s: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// open class A(i: Int) : Base("O" + if (i == 23){
// println("""THEN""");
// 
//     log += "logged"
//     "K"
// }
// else{
// println("""ELSE""");
// 
//     "fail"
// })
// 
// fun box(): String {
//     val result = A(23).s
//     if (result != "OK") {
// println("""THEN""");
// return "fail: $result"
// }
//     if (log != "logged") {
// println("""THEN""");
// return "fail log: $log"
// }
// 
//     return "OK"
// }

 var log = ""

open class Base{
val s:Stringconstructor(  s: String) {
this.s = s
}override fun toString(): String{
var res = ""
return res
}
}

open class A(i: Int) : Base("O" + if (i == 23){
println("""THEN""");

    log += "logged"
    "K"
}
else{
println("""ELSE""");

    "fail"
})

fun box(): String {
    val result = A(23).s
    if (result != "OK") {
println("""THEN""");
return "fail: $result"
}
    if (log != "logged") {
println("""THEN""");
return "fail log: $log"
}

    return "OK"
}
