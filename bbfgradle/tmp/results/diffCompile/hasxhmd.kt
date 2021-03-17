// Different compile happens on:JVM ,JVM -Xnew-inference

operator fun Int.component1(): String = TODO()
operator fun Int.component2(): Int = TODO()
fun box()  {
val (str, sq) = 1.rangeTo(TODO()).iterator().next()
strings.add(str)
}
    val strings = arrayListOf( 1,"" )