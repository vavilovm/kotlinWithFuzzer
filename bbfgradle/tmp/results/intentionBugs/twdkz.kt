// PSI ERROR. Modified in 35
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// package test
// 
// public enum class My(val s: String) {
//     ENTRY;
//     constructor(): this("OK")
// }
// 
// fun box() = My.ENTRY.s
// 

package test

public enum class My( s: String) {
    val s = sENTRY;
    constructor(): this("OK")
}

fun box() = My.ENTRY.s

