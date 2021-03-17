// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

inline fun f0()  {
f2(TODO())
}
inline fun f2(x: Int)  =
        f0()
