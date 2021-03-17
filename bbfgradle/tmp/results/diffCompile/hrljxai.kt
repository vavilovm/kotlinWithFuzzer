// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir
interface A<T> {
    fun foo(t: T?) = ""
}
interface B<T> {
    fun foo(t: T) = ""
}
class Z : A<Int>, B<Int>
