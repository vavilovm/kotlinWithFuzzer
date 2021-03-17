// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class UIntArray(
 val intArray: IntArray) {
fun set(index: Int ) {
        (intArray[index]) = TODO()
    }
}
