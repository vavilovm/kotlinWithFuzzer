// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class MyCollection<T>(
 delegate: Collection<T>): Collection<T> by delegate {
fun 
 toArray(array: Array<Any>): Array<Any>
 = TODO()
}
