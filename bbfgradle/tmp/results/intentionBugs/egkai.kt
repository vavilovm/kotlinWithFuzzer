// PSI ERROR. Modified in 108
// MODIFIED by Add labeled return to last expression in a lambda intention:
// ORIGINAL CODE:
//   fun <T> block(block: () -> T): T = block()
// tailrec fun foo() {}
// 
// tailrec fun test(): () -> Unit = block { tailrec fun() = foo() }
// 
// fun box(): String {
//     test()
//     return "OK"
// }
// 

  fun <T> block(block: () -> T): T = block()
tailrec fun foo() {}

tailrec fun test(): () -> Unit = block { return@block tailrec fun() = foo() }

fun box(): String {
    test()
    return "OK"
}

