// COMPILE != OK. Modified in 342
// MODIFIED by Convert to with intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // IGNORE_BACKEND_FIR: JVM_IR
// // KJS_WITH_FULL_RUNTIME
// // IGNORE_BACKEND: NATIVE
// 
// open class Map1 : HashMap<String, Any?>()
// internal class Map2 : Map1()
// fun box(): String {
//     val m = Map2()
//     if (m.entries.size != 0) {
// println("""THEN""");
// return "fail 1"
// }
// 
//     m.put("56", "OK")
//     val x = m.entries.iterator().next()
// 
//     if (x.key != "56" || x.value != "OK") {
// println("""THEN""");
// return "fail 2"
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

open class Map1 : HashMap<String, Any?>()
internal class Map2 : Map1()
fun box(): String {
    val m = Map2()
    if (this.entries.size != 0) {
println("""THEN""");
return "fail 1"
}

    with(m) {
    if (entries.size != 0) {
println("""THEN""");
return "fail 1"
}

    put("56", "OK")}
    val x = m.entries.iterator().next()

    if (x.key != "56" || x.value != "OK") {
println("""THEN""");
return "fail 2"
}

    return "OK"
}

