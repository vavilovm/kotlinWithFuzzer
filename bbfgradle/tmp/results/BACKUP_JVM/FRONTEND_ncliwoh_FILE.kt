// Bug happens on JVM 
//File: tmp/tmp0.kt

class Bob {
    fun Any.bar() = TODO
}
fun Bob?
.
() = when(this) {
String -> bar
}
