// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
test(  TODO(),{ it })
}
fun <T> test(  b: T,operation: (x: T?) -> T):Unit = TODO()