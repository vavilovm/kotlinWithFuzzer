// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.test.assertEquals

inline class S(val x: String)

interface IFoo<T> {
    fun memberFun(s1: S, s2: String): String
    fun memberFunT(x1: T, x2: String): String
    fun <X> genericMemberFun(x1: T, x2: X): String
    fun S.memberExtFun(s: String): String
    fun T.memberExtFunT(x: String): String
    fun <X> T.genericMemberExtFun(x: X): String
}

inline class FooImpl(val xs: Array<String>) : IFoo<S> {
    override fun memberFun(s1: S, s2: String): String = TODO()
    override fun memberFunT(x1: S, x2: String): String = TODO()
    override fun <X> genericMemberFun(x1: S, x2: X): String = TODO()
    override fun S.memberExtFun(s: String): String = TODO()
    override fun S.memberExtFunT(x: String): String = TODO()
    override fun <X> S.genericMemberExtFun(x: X): String = TODO()
}

class Test : IFoo<S> by FooImpl(arrayOf("1"))

fun box(): String =TODO()

sealed class A<T: Map<Double, FooImpl>> (){

val wmwzs: IFoo<LinkedHashMap<Long, Byte>> = TODO()
internal sealed class C<T: FooImpl> (val rq: String = "oaoir", val fs: T, val la: Array<T>){

infix public fun   Char.naiaf(a: Long): FooImpl = TODO()

val qpvet: List<ULong> = TODO()
internal sealed class E(val cr: UByte){

val omull: Int = TODO()

}
}
}


