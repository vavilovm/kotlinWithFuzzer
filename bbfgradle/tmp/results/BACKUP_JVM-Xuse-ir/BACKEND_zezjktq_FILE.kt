// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

inline fun catchAll(block: Int )  {
    bar()
}
inline fun bar()  =
        catchAll(TODO())

