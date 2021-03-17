// Different compile happens on:JVM ,JVM -Xnew-inference

val f : ()->String = {
when (false) {}
}!!
