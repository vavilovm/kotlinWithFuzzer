// Different compile happens on:JVM ,JVM -Xnew-inference
interface A {
    fun foo() 
}
fun bar(x: Any
)  {
    x as A 
        val k = x!!.foo()
}
