// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


inline class ZN(val z: Int
)
fun wrapN(): ZN
 = TODO()
fun box()  {
wrapN()
.z=
throw AssertionError()
}
