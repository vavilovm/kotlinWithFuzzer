// PSI ERROR. Modified in 50
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// public inline class Z1(val x: String?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class Z2(val z: Z1){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class ZN(val z: Z1?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun wrap1(x: String): Z1? = if (x.length == 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// Z1(x)
// }
// fun wrap2(x: String): Z2? = if (x.length == 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// Z2(Z1(x))
// }
// tailrec fun wrapN(x: String): ZN? = if (x.length == 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// ZN(Z1(x))
// }
// 
// tailrec fun box(): String {
//     if (wrap1("") != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap1("a") == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap1("a")!!.x != "a") {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (wrap2("") != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap2("a") == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap2("a")!!.z.x != "a") {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (wrapN("") != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN("a") == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN("a")!!.z!!.x != "a") {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses

public inline class Z1{
val x:String?constructor(  x: String?) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}
inline class Z2(val z: Z1){
override fun toString(): String{
var res = ""
return res
}
}
inline class ZN(val z: Z1?){
override fun toString(): String{
var res = ""
return res
}
}

fun wrap1(x: String): Z1? = if (x.length == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z1(x)
}
fun wrap2(x: String): Z2? = if (x.length == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z2(Z1(x))
}
tailrec fun wrapN(x: String): ZN? = if (x.length == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
ZN(Z1(x))
}

tailrec fun box(): String {
    if (wrap1("") != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1("a") == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1("a")!!.x != "a") {
println("""THEN""");
throw AssertionError()
}

    if (wrap2("") != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2("a") == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2("a")!!.z.x != "a") {
println("""THEN""");
throw AssertionError()
}

    if (wrapN("") != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN("a") == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN("a")!!.z!!.x != "a") {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
