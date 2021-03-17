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

data internal  class A(val cu: Triple<UShort, Test, Boolean> = Triple<UShort, Test, Boolean>(21073.toUShort(), Test(), true), val id: Char, val kx: HashMap<LinkedHashMap<S, UByte>, S>, val jg: Double, val tp: Sequence<Double>): IFoo <FooImpl>{

override fun memberFun(s1: S, s2: kotlin.String): kotlin.String = TODO()

override fun memberFunT(x1: FooImpl, x2: kotlin.String): kotlin.String = TODO()

override fun <X> genericMemberFun(x1: FooImpl, x2: X): kotlin.String = TODO()

override fun S.memberExtFun(s: kotlin.String): kotlin.String = TODO()

override fun FooImpl.memberExtFunT(x: kotlin.String): kotlin.String = TODO()

override fun <X> FooImpl.genericMemberExtFun(x: X): kotlin.String = TODO()

val rqogs: S = TODO()
data private  class C<T, S: UShort> (val zt: S){

val zqhcy: Sequence<Float> = TODO()

}
}


