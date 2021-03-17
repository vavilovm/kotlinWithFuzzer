// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

inline class Z(val x: (Int)?)
inline class L(val x: (Long))
inline class S(val x: String)

fun box()  {
    
val u:Any = TODO()
throw AssertionError()

    
val k:Any = TODO()
if (L((L())::xx.get())::xx.get() != 1234L) throw AssertionError()

    true

    
}
val L.xx get() = x
val Z.xx get() = x

val S.xx get() = x
