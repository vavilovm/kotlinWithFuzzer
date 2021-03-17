// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline fun <reified T> underlying(a: IC)  = {
    a.value as T
}
inline class IC(val value: Any
)
fun box()   = 
    underlying<Int>(TODO())
