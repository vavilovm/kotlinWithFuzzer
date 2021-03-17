// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


 inline fun <reified T> underlying(a: IC)  = {
    a as T
}
interface Foo
inline class IC(val value: Any): Foo
fun box()   = 
    underlying<Int>(TODO())
