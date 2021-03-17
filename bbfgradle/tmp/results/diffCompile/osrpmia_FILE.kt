// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


inline operator fun Any.getValue( t:Any?,p: Any): Any =
{
 val x by ""
}

