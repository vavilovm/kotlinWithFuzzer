// Bug happens on JVM 
// FILE: tmp0.kt

fun box() : Any {
try {
try {}
catch(e: AssertionError){
Array<Any>(TODO(),{ 
return ""
 })
}
finally {
return ""
}
}
finally {}
}
