// COMPILE != OK. Modified in 222
// MODIFIED by Convert to nullable var intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
// // WITH_RUNTIME
// 
// import kotlin.UninitializedPropertyAccessException
// 
// fun runNoInline(f: () -> Unit) = f()
// 
// tailrec fun box(): String {
//     lateinit var str: String
//     var str2: String = ""
//     try{
// println("""TRY""");
// 
//         runNoInline {
//             str2 = str
//         }
//         return "Should throw an exception"
// }
//     catch (e: UninitializedPropertyAccessException){
// println("""CATCH e: UninitializedPropertyAccessException""");
// 
//         return "OK"
// }
//     catch (e: Throwable){
// println("""CATCH e: Throwable""");
// 
//         return "Unexpected exception: ${e::class}"
// }
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
// WITH_RUNTIME

import kotlin.UninitializedPropertyAccessException

fun runNoInline(f: () -> Unit) = f()

tailrec fun box(): String {
    var str: String?=null
    var str2: String = ""
    try{
println("""TRY""");

        runNoInline {
            str2 = str
        }
        return "Should throw an exception"
}
    catch (e: UninitializedPropertyAccessException){
println("""CATCH e: UninitializedPropertyAccessException""");

        return "OK"
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        return "Unexpected exception: ${e::class}"
}
}

