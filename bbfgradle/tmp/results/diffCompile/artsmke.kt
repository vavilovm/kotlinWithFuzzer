// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir
interface A<T> {
    fun foo( l: T,bar: Any
) = ""
}
interface B<T, U> {
    fun foo( t: String,values: U) = ""
}
interface Z1 : A<String>, B<String, Int>
class Z1C : Z1
