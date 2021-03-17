// Different compile happens on:JVM ,JVM -Xnew-inference

class AsAny(val a: Any
)
fun AsAny.myEq(other: Any
)  {
other is AsAny && other!!.a == a
}
