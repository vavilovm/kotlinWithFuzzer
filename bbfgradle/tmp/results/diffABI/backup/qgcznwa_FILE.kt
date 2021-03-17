// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

interface KCallable {
    val MyCollection: String
}
fun acceptingBoxed(x : Int?) : String ? = TODO()


fun box(): Any? =TODO()
class returnType<T>(val delegate: Collection<T>): Collection<T> by delegate {
    private
    tailrec fun toArray(): Array<Int> =TODO() fun <E> toArray(array: Array<Array<E>>): E =TODO()
}
