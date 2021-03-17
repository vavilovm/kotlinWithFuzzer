// Different compile happens on:JVM ,JVM -Xnew-inference
fun box()  {
1?.equals({} ?: true)
}