// PSI ERROR. Modified in 31
// MODIFIED by Move to class body intention:
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
// tailrec fun box(): String {
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

open class Base( s: String){
val s = soverride fun toString(): String{
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

tailrec fun box(): String {
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
