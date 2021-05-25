// COMPILE != OK. Modified in 218
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // IGNORE_BACKEND_FIR: JVM_IR
// // KJS_WITH_FULL_RUNTIME
// // IGNORE_BACKEND: NATIVE
// 
// open class A : ArrayList<String>() {
//     public override val size: Int get() = super.size + 56
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val a = A()
//     if (a.size != 56) {
// println("""THEN""");
// return "fail: ${a.size}"
// }
// 
//     return "OK"
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_COLLECTIONS
// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// IGNORE_BACKEND: NATIVE

open class A : ArrayList<String>() {
    public override fun getSize(): Int = super.size + 56
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val a = A()
    if (a.size != 56) {
println("""THEN""");
return "fail: ${a.size}"
}

    return "OK"
}

