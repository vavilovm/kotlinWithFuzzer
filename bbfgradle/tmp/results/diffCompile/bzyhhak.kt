// Different compile happens on:JVM ,JVM -Xnew-inference
class Foo
(val param: String = ""
) {
    companion object {
val s = Foo()
}
}
fun box()  {
when (Any()) {
 try
{{}}
catch(e: Exception){}
 -> Foo
.s
.param
}
}
