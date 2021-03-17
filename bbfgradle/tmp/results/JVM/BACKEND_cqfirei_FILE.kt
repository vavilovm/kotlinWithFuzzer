// Bug happens on JVM 
// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField
// FILE: tmp0.kt


fun test() =
try {}
catch(e: IndexOutOfBoundsException){
{
try {}
finally {
 {}
}
}
}

