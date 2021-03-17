// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

inline fun Array<String>.matchAll3()  =
matchAll()
inline fun Array<String>.matchAll() {
    matchAll3()
}

