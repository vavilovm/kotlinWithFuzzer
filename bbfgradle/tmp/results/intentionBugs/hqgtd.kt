// COMPILE != OK. Modified in 268
// MODIFIED by Convert to apply intention:
// ORIGINAL CODE:
//  tailrec inline fun <T> runReadAction(crossinline runnable: () -> T): T = runnable()
// 
// class Foo {
//     tailrec fun <K> infer(): K = "OK" as K
// }
// 
// fun bar(): Int? = 42
// 
// fun box(): String {
//     return runReadAction {
//         bar() ?: return@runReadAction "Failed"
//         val foo = Foo()
//         foo.infer()
//     }
// }
// 

 tailrec inline fun <T> runReadAction(crossinline runnable: () -> T): T = runnable()

class Foo {
    tailrec fun <K> infer(): K = "OK" as K
}

fun bar(): Int? = 42

fun box(): String {
    return runReadAction {
        bar() ?: return@runReadAction "Failed"
        val foo = Foo().apply {
        infer()}
    }
}

