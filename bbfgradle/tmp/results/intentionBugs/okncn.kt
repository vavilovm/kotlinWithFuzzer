// PSI ERROR. Modified in 98
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
//   fun <T> block(block: () -> T): T = block()
// tailrec fun foo() {}
// 
// fun test(): () -> Unit = block { tailrec fun() = foo() }
// 
// fun box(): String {
//     test()
//     return "OK"
// }
// 

  fun <T> block(block: () -> T): T = block()
tailrec fun foo() {}

fun test(): () -> Unit = block(fun(): () -> Unit {
    return tailrec fun() = foo()
})

fun box(): String {
    test()
    return "OK"
}

