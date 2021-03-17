// Bug happens on JS 
// WITH_RUNTIME
// FILE: tmp0.kt


fun <T : Iterable<*>> test(iterable: T)  {
    val s = StringBuilder()
for ((index
) in iterable.withIndex()
) 
        s
.append("")
}

