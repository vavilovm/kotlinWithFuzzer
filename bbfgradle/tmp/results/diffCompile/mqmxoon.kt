// Different compile happens on:JVM ,JVM -Xnew-inference

open class Base(
 callback: () -> Unit)
class Inner : Base(run { { Any() } }
)
