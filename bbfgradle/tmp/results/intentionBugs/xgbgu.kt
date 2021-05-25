// PSI ERROR. Modified in 157
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: BRIDGE_ISSUES
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// import kotlin.test.*
// 
// public inline class S(val string: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun foo(s: S) = s
// 
// fun box(): String {
//     val fooRef = ::foo
// 
//     assertEquals("abc", fooRef.invoke(S("abc")).string)
//     assertEquals("foo", fooRef.name)
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: BRIDGE_ISSUES
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
import kotlin.test.*

public inline class S{
val string:Stringconstructor(  string: String) {
this.string = string
}override fun toString(): String{
var res = ""
return res
}
}

fun foo(s: S) = s

fun box(): String {
    val fooRef = ::foo

    assertEquals("abc", fooRef.invoke(S("abc")).string)
    assertEquals("foo", fooRef.name)

    return "OK"
}
