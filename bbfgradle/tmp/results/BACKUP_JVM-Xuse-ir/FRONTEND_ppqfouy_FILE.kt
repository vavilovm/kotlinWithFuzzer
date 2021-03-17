// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Bob {
    fun Any.bar() = TODO
}
fun Bob?
.
() = when(this) {
String -> bar
}
