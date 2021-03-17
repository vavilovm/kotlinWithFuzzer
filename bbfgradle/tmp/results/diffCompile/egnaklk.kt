// Different compile happens on:JVM ,JVM -Xnew-inference

var state = null
fun box(): String {
"" != (if (return "") 
 "") ?: state
}
