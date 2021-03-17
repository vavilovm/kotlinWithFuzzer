// Different compile happens on:JVM ,JVM -Xnew-inference
class Foo
(val param: String = "") {
    companion object {
        val s = {Foo().param}
    }
}
fun box()  {
if (true) {{false}} else Foo.s
}
