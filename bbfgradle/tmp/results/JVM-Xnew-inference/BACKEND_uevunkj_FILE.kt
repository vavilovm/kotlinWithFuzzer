// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

class MyArrayList<T> {
    operator fun get(index: Int): T = TODO()
    operator fun set( index: Int?,value: T): T
            = TODO()
}
fun test1()   {
    var mnr  = MyArrayList<Int>()
    mnr[1]++
}
