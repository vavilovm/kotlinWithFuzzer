// COMPILE != OK. Modified in 56
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
//  open class Base() {
//     val plain = 239
//     public val read : Int
//       get() = 239
// 
//     public var readwrite : Int = 0
//       get() = field + 1
//       set(n : Int) {
//         field = n
//       }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// abstract interface Abstract {}
// 
// private open class Derived1() : Base(), Abstract {}
// open class Derived2() : Abstract, Base() {}
// 
// fun code(s : Base) : Int {
//     if (s.plain != 239) {
// println("""THEN""");
// return 1
// }
//     if (s.read != 239) {
// println("""THEN""");
// return 2
// }
//     s.readwrite = 238
//     if (s.readwrite != 239) {
// println("""THEN""");
// return 3
// }
//     return 0
// }
// 
// fun test(s : Base) : Boolean = code(s) == 0
// 
// fun box() : String {
//     if (!test(Base())) {
// println("""THEN""");
// return "Fail #1"
// }
//     if (!test(Derived1())) {
// println("""THEN""");
// return "Fail #2"
// }
//     if (!test(Derived2())) {
// println("""THEN""");
// return "Fail #3"
// }
//     return "OK"
// }
// 

 open class Base() {
    val plain = 239
    public fun getRead() : Int = 239

    public var readwrite : Int = 0
      get() = field + 1
      set(n : Int) {
        field = n
      }
override fun toString(): String{
var res = ""
return res
}}

abstract interface Abstract {}

private open class Derived1() : Base(), Abstract {}
open class Derived2() : Abstract, Base() {}

fun code(s : Base) : Int {
    if (s.plain != 239) {
println("""THEN""");
return 1
}
    if (s.read != 239) {
println("""THEN""");
return 2
}
    s.readwrite = 238
    if (s.readwrite != 239) {
println("""THEN""");
return 3
}
    return 0
}

fun test(s : Base) : Boolean = code(s) == 0

fun box() : String {
    if (!test(Base())) {
println("""THEN""");
return "Fail #1"
}
    if (!test(Derived1())) {
println("""THEN""");
return "Fail #2"
}
    if (!test(Derived2())) {
println("""THEN""");
return "Fail #3"
}
    return "OK"
}

