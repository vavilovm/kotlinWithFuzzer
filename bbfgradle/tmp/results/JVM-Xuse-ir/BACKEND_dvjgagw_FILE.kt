// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


fun box()   =
try {}
catch(e: Throwable){
{
 try {}
catch(e: CharacterCodingException){
::value
}
}
}
