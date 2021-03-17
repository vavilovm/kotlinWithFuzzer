// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp.kt


inline class AsInt(val x: Int)
fun <
 T> Any
.checkcast()  = this as T
fun box1()   =
f1<Int>()
var prop1: Any = TODO()
inline fun <reified smth0> f1() {
val c = 1
val d7 = c.checkcast<AsInt>()
prop1 = {
        d7.x as? smth0
}
}

