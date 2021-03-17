// Different compile happens on:JVM ,JVM -Xnew-inference
class B
fun B.magic():Unit = TODO()
fun boom(a: Any) {
    when (a) {
        is B -> 
(a
::magic)
    }
}
