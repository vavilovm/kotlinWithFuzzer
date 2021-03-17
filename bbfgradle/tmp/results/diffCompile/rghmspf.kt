// Different compile happens on:JVM ,JVM -Xnew-inference
fun foo(): Any
 {
return when (Any()) {
1L -> 1u
1, 1 -> 1
        else -> 1
    }!!
}
