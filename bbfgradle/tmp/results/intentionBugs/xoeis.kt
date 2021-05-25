// PSI ERROR. Modified in 35
// MODIFIED by Convert to secondary constructor intention:
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

public enum class My {
    ENTRY;val s:Stringconstructor(  s: String) {
this.s = s
}
    constructor(): this("OK")
}

fun box() = My.ENTRY.s

