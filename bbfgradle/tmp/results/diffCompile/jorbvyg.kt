// Different compile happens on:JVM ,JVM -Xnew-inference

fun foo(a: Any
)  {
a as BooleanArray
a!!.size
}
