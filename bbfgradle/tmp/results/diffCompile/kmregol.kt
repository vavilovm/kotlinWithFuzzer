// Different compile happens on:JVM ,JVM -Xnew-inference
val z: Int
 = TODO()
fun box()  {
    (z ?: true === 1L)
.not()
}
