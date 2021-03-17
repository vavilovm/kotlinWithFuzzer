// Different compile happens on:JVM ,JVM -Xnew-inference
fun <T> test(operation: (Outer: T) -> T  ):Unit = TODO()

fun box()  {
test{ a : Int -> }
}