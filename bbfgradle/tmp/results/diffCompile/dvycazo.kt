// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
    val plusZero: Any
val minusZero: Any = TODO()
    if (plusZero is Double && minusZero is Double) 
        when {
plusZero > minusZero!! -> {}
}
}