// Different compile happens on:JVM ,JVM -Xnew-inference

class Z
class L
fun Z.test() = 1
fun L.test() = ""
fun box()  {
Z::test
.equals(TODO()) ?: L()::test
.invoke() == 1
}