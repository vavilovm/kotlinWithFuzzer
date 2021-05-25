// PSI ERROR. Modified in 34
// MODIFIED by Convert to secondary constructor intention:
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

internal enum class My {
    ENTRY;val s:Stringconstructor(  s: String) {
this.s = s
}
    constructor(): this("OK")
}

fun box() = My.ENTRY.s

