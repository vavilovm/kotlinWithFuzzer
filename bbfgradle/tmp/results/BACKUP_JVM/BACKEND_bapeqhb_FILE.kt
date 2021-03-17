// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp.kt

inline class Z(val int: Int)
fun fooZ(x: Z) = x
fun box()   = 
    ::fooZ
.invoke(TODO()).int++

