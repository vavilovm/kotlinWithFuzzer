// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt


fun Int.foo() = 
 try {
::bar
}
catch(e: CharacterCodingException){
{
try {
::bar
}
finally {}
}
}
fun Any.bar(x: Int) = x

