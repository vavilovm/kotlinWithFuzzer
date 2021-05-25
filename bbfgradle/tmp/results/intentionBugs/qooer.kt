// PSI ERROR. Modified in 37
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// package test
// 
// internal enum class My(val s: String) {
//     ENTRY;
//     constructor(): this("OK")
// }
// 
// fun box() = My.ENTRY.s
// 

package test

internal enum class My( s: String) {
    val s = sENTRY;
    constructor(): this("OK")
}

fun box() = My.ENTRY.s

