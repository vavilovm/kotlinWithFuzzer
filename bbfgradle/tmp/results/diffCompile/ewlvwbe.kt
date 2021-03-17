// Different compile happens on:JVM ,JVM -Xnew-inference
open class Test1
class Test2: Test1() {
    fun foo(): String = TODO()
}
fun Test1.test1()  {
if (this is Test2)  this!!.foo()
}
