// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir
    open class A<T> {
fun foo(a: String?) = ""
open fun foo(reeeq: T) = ""
}
class Z : A<String>() {
override fun foo(t: String) = ""
}
