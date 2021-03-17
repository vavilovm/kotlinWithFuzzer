// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


val log = StringBuilder()
fun logged( message: Int,value: Int) =
    value.also { try {
log
}
finally {
 {}
}.append(message) }

