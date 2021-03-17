// Bug happens on JVM -Xuse-ir
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

