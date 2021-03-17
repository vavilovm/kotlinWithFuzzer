// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class R(private val r: Int) {
    fun test():String = TODO()

    fun ok():String = TODO()
}

fun box():String = TODO()

data   class A<T: ULong> (val ix: T, val zf: UByte = 123.toUByte()){

val rqriq: LinkedHashMap<Sequence<R>, LinkedHashMap<Boolean, R>> = TODO()

}


