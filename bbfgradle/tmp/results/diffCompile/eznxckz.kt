// Different compile happens on:JVM ,JVM -Xnew-inference
open class Test1 {
    fun test1()  {
        this as Test2
this!!.foo()
}
}
class Test2: Test1() {
    fun foo(): String
 = TODO()
}
