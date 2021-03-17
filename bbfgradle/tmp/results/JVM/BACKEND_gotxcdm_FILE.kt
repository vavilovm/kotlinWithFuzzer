// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt


fun foo(x: Any =
try {
{
try {}
finally {
 {}
}
}
}
finally {}
): Int = TODO()

