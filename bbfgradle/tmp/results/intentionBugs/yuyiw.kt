// PSI ERROR. Modified in 109
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// // KJS_WITH_FULL_RUNTIME
// class Outer(val foo: StringBuilder) {
//   inner class Inner() {
//     tailrec fun len() : Int {
//       return foo.length
//     }
//   }
// 
//   fun test() : Inner {
//     return Inner()
//   }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box() : String {
//   val sb = StringBuilder("xyzzy")
//   val o = Outer(sb)
//   val i = o.test()
//   val l = i.len()
//   return if (l != 5) {
// println("""THEN""");
// "fail"
// } else {
// println("""ELSE""");
// "OK"
// }
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_STRING_BUILDER
// KJS_WITH_FULL_RUNTIME
class Outer {
  val foo:StringBuilderconstructor(  foo: StringBuilder) {
this.foo = foo
}inner class Inner() {
    tailrec fun len() : Int {
      return foo.length
    }
  }

  fun test() : Inner {
    return Inner()
  }
override fun toString(): String{
var res = ""
return res
}}

fun box() : String {
  val sb = StringBuilder("xyzzy")
  val o = Outer(sb)
  val i = o.test()
  val l = i.len()
  return if (l != 5) {
println("""THEN""");
"fail"
} else {
println("""ELSE""");
"OK"
}
}

