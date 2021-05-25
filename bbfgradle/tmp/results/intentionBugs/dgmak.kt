// COMPILE != OK. Modified in 565
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// // WITH_COROUTINES
// // FULL_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// internal class JarFile {
//     fun entries() = listOf<String>()
// }
// 
// private fun scriptTemplatesDiscoverySequence(): Sequence<String> {
//     return sequence<String> {
//         for (dep in listOf<String>()) {
//             try{
// println("""TRY""");
// 
//                 val jar = JarFile()
//                 try {
//                     jar.entries().map { it }
//                     val (loadedDefinitions, notFoundClasses) = listOf<String>() to listOf<String>()
//                     listOf<String>().forEach {
//                         yield(it)
//                     }
//                 } catch (e: Throwable) {
//                     e.message
//                 }
// } catch (e: Exception){
// println("""CATCH e: Exception""");
// 
//                 e.message
// }
//         }
//         yield("OK")
//     }
// }
// 
// fun box(): String {
//     return scriptTemplatesDiscoverySequence().first()
// }
// 

// WITH_RUNTIME
// WITH_COROUTINES
// FULL_RUNTIME
// KJS_WITH_FULL_RUNTIME

internal class JarFile {
    fun entries() = listOf<String>()
}

private fun scriptTemplatesDiscoverySequence(): Sequence<String> {
    return sequence<String> {
        for (dep in listOf<String>()) {
            try{
println("""TRY""");

                val jar = JarFile()
                try {
                    jar.entries().map { it }
                    val (loadedDefinitions, notFoundClasses) = listOf<String>() to listOf<String>()
                    listOf<String>().forEach(fun(it: String) {
    yield(it)
})
                } catch (e: Throwable) {
                    e.message
                }
} catch (e: Exception){
println("""CATCH e: Exception""");

                e.message
}
        }
        yield("OK")
    }
}

fun box(): String {
    return scriptTemplatesDiscoverySequence().first()
}

