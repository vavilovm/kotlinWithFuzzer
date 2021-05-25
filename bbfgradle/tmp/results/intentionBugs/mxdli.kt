// COMPILE != OK. Modified in 481
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
// tailrec fun zap(s: String) = s
// 
// inline fun tryZap(s1: String, s2: String, fn: String.(String) -> String) =
//         fn(
//                 try {
// println("""TRY""");
// zap(s1)
// } catch (e: Exception) {
// println("""CATCH e: Exception""");
// ""
// },
//                 try {
// println("""TRY""");
// zap(s2)
// } catch (e: Exception) {
// println("""CATCH e: Exception""");
// ""
// }
//         )
// 
// fun box(): String = tryZap("O", "K") { this + it }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
tailrec fun zap(s: String) = s

inline fun tryZap(s1: String, s2: String, fn: String.(String) -> String) =
        fn(
                try {
println("""TRY""");
zap(s1)
} catch (e: Exception) {
println("""CATCH e: Exception""");
""
},
                try {
println("""TRY""");
zap(s2)
} catch (e: Exception) {
println("""CATCH e: Exception""");
""
}
        )

fun box(): String = tryZap("O", "K",fun(): Any {
    return this + it
})
