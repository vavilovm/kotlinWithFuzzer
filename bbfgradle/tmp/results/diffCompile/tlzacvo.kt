// Different compile happens on:JVM ,JVM -Xnew-inference

fun test()  {
    val a = if (true) IntArray(TODO()) else LongArray(TODO())
    a is String
}
