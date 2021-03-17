// Different compile happens on:JVM ,JVM -Xnew-inference

interface Foo<OK>
interface Bar<S>
fun <T, S> T.bip(): String where S : Foo<T>, S: Bar<T> = TODO()
fun box()  {
Any().bip()
}