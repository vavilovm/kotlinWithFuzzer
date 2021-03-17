// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

@Suppress( "INVISIBLE_MEMBER","INVISIBLE_REFERENCE")
@kotlin.internal.LowPriorityInOverloadResolution
fun bar():Int = TODO()
fun bar():Int = TODO()

