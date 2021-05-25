// PSI ERROR. Modified in 168
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: PROPERTY_REFERENCES
// // !LANGUAGE: +InlineClasses
// 
// var setterInvoked = 0
// internal var backing = 42
// 
// inline class Delegate(val ignored: Int) {
// 
//     operator fun getValue(thisRef: Any?, prop: Any?) =
//         backing
// 
//     operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int) {
//         setterInvoked++
//         backing = newValue
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// var topLevelD by Delegate(0)
// 
// fun box(): String {
//     if (topLevelD != 42) {
// println("""THEN""");
// AssertionError()
// }
// 
//     topLevelD = 1234
//     if (topLevelD != 1234) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (backing != 1234) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (setterInvoked != 1) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: PROPERTY_REFERENCES
// !LANGUAGE: +InlineClasses

var setterInvoked = 0
internal var backing = 42

inline class Delegate {

    val ignored:Intconstructor(  ignored: Int) {
this.ignored = ignored
}operator fun getValue(thisRef: Any?, prop: Any?) =
        backing

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int) {
        setterInvoked++
        backing = newValue
    }
override fun toString(): String{
var res = ""
return res
}}

var topLevelD by Delegate(0)

fun box(): String {
    if (topLevelD != 42) {
println("""THEN""");
AssertionError()
}

    topLevelD = 1234
    if (topLevelD != 1234) {
println("""THEN""");
throw AssertionError()
}
    if (backing != 1234) {
println("""THEN""");
throw AssertionError()
}

    if (setterInvoked != 1) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}
