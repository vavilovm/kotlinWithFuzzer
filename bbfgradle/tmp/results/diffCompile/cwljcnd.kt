// Different compile happens on:JVM ,JVM -Xnew-inference
fun <T> bar(x: T): T = TODO()
val i:Any = TODO()
    val x1: (Int) -> Int = bar(when (i) {
                                   1 -> ::bar
})
