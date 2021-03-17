// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun 
()  {
    val f1 = Foo()
    val ff1: Foo = TODO
ff1
.compareTo(f1)
}
class Foo : Comparable<Comparable<Foo>>
