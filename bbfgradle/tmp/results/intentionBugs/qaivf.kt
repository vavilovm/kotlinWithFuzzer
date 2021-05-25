// PSI ERROR. Modified in 172
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  interface Option<out T> {
//     val s: String
// }
// class Some<T>(override val s: String) : Option<T>{
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// public class None(override val s: String = "None") : Option<Int>{
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun whenTest(a: Int): Option<Any> = when (a) {
//     239 ->{
// println("""WHEN 239""");
// 
//         if (a == 239) {
// println("""THEN""");
// Some("239")
// } else {
// println("""ELSE""");
// None()
// }
// }
//     else -> {
// println("""WHEN """);
// if (a != 239) {
// println("""THEN""");
// Some("$a")
// } else {
// println("""ELSE""");
// None()
// }
// }
// }
// 
// fun ifTest(a: Int): Option<Any> = if (a == 239){
// println("""THEN""");
// 
//     if (a == 239) Some("239") else None()
// } else {
// println("""ELSE""");
// if (a != 239) Some("$a") else None()
// }
// 
// fun box(): String {
//     if (whenTest(2).s != "2") {
// println("""THEN""");
// return "Fail 1"
// }
//     if (whenTest(239).s != "239") {
// println("""THEN""");
// return "Fail 2"
// }
// 
//     if (ifTest(2).s != "2") {
// println("""THEN""");
// return "Fail 3"
// }
//     if (ifTest(239).s != "239") {
// println("""THEN""");
// return "Fail 4"
// }
// 
//     return "OK"
// }

 interface Option<out T> {
    val s: String
}
class Some<T>(override val s: String) : Option<T>{
override fun toString(): String{
var res = ""
return res
}
}
public class None : Option<Int>{
override  val s:Stringconstructor(  s: String = "None") {
this.s = s
}override fun toString(): String{
var res = ""
return res
}
}

fun whenTest(a: Int): Option<Any> = when (a) {
    239 ->{
println("""WHEN 239""");

        if (a == 239) {
println("""THEN""");
Some("239")
} else {
println("""ELSE""");
None()
}
}
    else -> {
println("""WHEN """);
if (a != 239) {
println("""THEN""");
Some("$a")
} else {
println("""ELSE""");
None()
}
}
}

fun ifTest(a: Int): Option<Any> = if (a == 239){
println("""THEN""");

    if (a == 239) Some("239") else None()
} else {
println("""ELSE""");
if (a != 239) Some("$a") else None()
}

fun box(): String {
    if (whenTest(2).s != "2") {
println("""THEN""");
return "Fail 1"
}
    if (whenTest(239).s != "239") {
println("""THEN""");
return "Fail 2"
}

    if (ifTest(2).s != "2") {
println("""THEN""");
return "Fail 3"
}
    if (ifTest(239).s != "239") {
println("""THEN""");
return "Fail 4"
}

    return "OK"
}
