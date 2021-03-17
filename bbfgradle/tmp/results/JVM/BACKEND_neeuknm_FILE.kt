// Bug happens on JVM 
// !LANGUAGE: +PolymorphicSignature
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


fun box()   =
try {
{
try {}
finally {
 {}
}::class
}
}
catch(e: NumberFormatException){}

