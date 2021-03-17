// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

interface KCallable {
    val returnType: String
}
fun acceptingBoxed(x : Int?) : Int ? = TODO()


fun box(): String =TODO()
class MyCollection<T>(val delegate: Collection<T>): Collection<T> by delegate {
    internal fun toArray(): Array<Any?> =TODO()
    public fun <E> toArray(array: Array<E>): Array<E> =TODO()
}
