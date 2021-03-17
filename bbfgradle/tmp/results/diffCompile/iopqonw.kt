// Different compile happens on:JVM ,JVM -Xnew-inference
fun test(cl: Int.() -> Int):Int = TODO()
class Foo
val Foo.a get() = test {
when (false) {}
}
