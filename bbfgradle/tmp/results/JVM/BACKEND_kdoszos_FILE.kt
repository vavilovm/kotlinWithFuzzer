// Bug happens on JVM 
// FILE: tmp0.kt


fun <
 T : Int> some(v: T? ): Int  = 
    TODO()
fun box() = when {
some(null ) != 1 -> ""
else -> ""
}
