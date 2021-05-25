// PSI ERROR. Modified in 46
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // !LANGUAGE: +InlineClasses
// 
// inline class Z1(val x: Int){
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
// inline class ZN2(val z: ZN){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun wrap1(n: Int): Z1? = if (n < 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// Z1(n)
// }
// fun wrap2(n: Int): Z2? = if (n < 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// Z2(Z1(n))
// }
// fun wrapN(n: Int): ZN? = if (n < 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// ZN(Z1(n))
// }
// fun wrapN2(n: Int): ZN2? = if (n < 0) {
// println("""THEN""");
// null
// } else {
// println("""ELSE""");
// ZN2(ZN(Z1(n)))
// }
// 
// tailrec fun box(): String {
//     if (wrap1(-1) != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap1(42) == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap1(42)!!.x != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (wrap2(-1) != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap2(42) == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrap2(42)!!.z.x != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (wrapN(-1) != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN(42) == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN(42)!!.z!!.x != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (wrapN2(-1) != null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN2(42) == null) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (wrapN2(42)!!.z.z!!.x != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// !LANGUAGE: +InlineClasses

inline class Z1( x: Int){
val x = xoverride fun toString(): String{
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
inline class ZN2(val z: ZN){
override fun toString(): String{
var res = ""
return res
}
}

fun wrap1(n: Int): Z1? = if (n < 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z1(n)
}
fun wrap2(n: Int): Z2? = if (n < 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z2(Z1(n))
}
fun wrapN(n: Int): ZN? = if (n < 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
ZN(Z1(n))
}
fun wrapN2(n: Int): ZN2? = if (n < 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
ZN2(ZN(Z1(n)))
}

tailrec fun box(): String {
    if (wrap1(-1) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1(42) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1(42)!!.x != 42) {
println("""THEN""");
throw AssertionError()
}

    if (wrap2(-1) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2(42) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2(42)!!.z.x != 42) {
println("""THEN""");
throw AssertionError()
}

    if (wrapN(-1) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN(42) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN(42)!!.z!!.x != 42) {
println("""THEN""");
throw AssertionError()
}

    if (wrapN2(-1) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN2(42) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN2(42)!!.z.z!!.x != 42) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
