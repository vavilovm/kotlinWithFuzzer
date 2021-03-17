// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

inline fun catchAll()   =
tryTwice(TODO())
inline fun tryTwice(block: Int) {
catchAll()
}
