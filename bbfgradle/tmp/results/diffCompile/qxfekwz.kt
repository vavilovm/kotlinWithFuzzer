// Different compile happens on:JVM ,JVM -Xnew-inference
interface Foo<T>
interface Bar<T>
val baz:Any = TODO()
.bip()
fun <T, S> T
.bip(): String where S : Foo<T>
, S: Bar<S?>
 = TODO()
