// COMPILE != OK. Modified in 551
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: PROPERTY_REFERENCES
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// import kotlin.test.assertEquals
// 
// inline class Z(internal val x: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// private inline class L(internal val x: Long){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class S(internal val x: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// tailrec fun box(): String {
//     assertEquals(42, Z::x.get(Z(42)))
//     assertEquals(1234L, L::x.get(L(1234L)))
//     assertEquals("abc", S::x.get(S("abc")))
// 
//     assertEquals(42, Z::x.invoke(Z(42)))
//     assertEquals(1234L, L::x.invoke(L(1234L)))
//     assertEquals("abc", S::x.invoke(S("abc")))
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: PROPERTY_REFERENCES
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
import kotlin.test.assertEquals

inline class Z(internal val x: Int){
override fun toString(): String{
var res = ""
return res
}
}
private inline class L(internal val x: Long){
override fun toString(): String{
var res = ""
return res
}
}
inline class S(internal val x: String){
override fun toString(): String{
var res = ""
return res
}
}

tailrec fun box(): String {
    assertEquals(42, Z::x.get(Z(42)))
    assertEquals(1234L, { l: L -> l.x }.get(L(1234L)))
    assertEquals("abc", S::x.get(S("abc")))

    assertEquals(42, Z::x.invoke(Z(42)))
    assertEquals(1234L, L::x.invoke(L(1234L)))
    assertEquals("abc", S::x.invoke(S("abc")))

    return "OK"
}
