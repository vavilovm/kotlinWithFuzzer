// Different compile happens on:JVM ,JVM -Xnew-inference

val <T> T.withLabel1: ()->T get() = fun () = this
fun box(): String {
return "".withLabel1()
}