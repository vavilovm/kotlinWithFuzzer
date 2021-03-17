// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
    var sum = 1u
val el = arrayOf( 1,1u ).iterator().next()
sum = el
}