// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


fun cnjy()   =
Class.forName(TODO()).declaredMethods.single {
try {}
finally{
{}
}
it
.name.startsWith("")
}

