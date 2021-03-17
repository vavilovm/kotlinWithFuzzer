// Different compile happens on:JVM ,JVM -Xnew-inference

interface IBase {
    fun testDefault1() = if (this is B) this!!.foo() else ""
}
interface IFoo : IBase {
fun foo()
}
class B
 : IFoo {
    override fun foo() = TODO()
}
