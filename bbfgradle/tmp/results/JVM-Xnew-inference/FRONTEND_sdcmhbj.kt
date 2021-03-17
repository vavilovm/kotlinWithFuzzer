// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.Result.Value
import a.Result.ParseError
import a.Parser
import a.Result
interface T {
    fun foo(): Unit
}

open class A : T {
    override fun foo(): Unit {}
}

class B : A(), T
class C : T, A()

interface U : T
class D : U, A()
class E : A(), U
class F : U, T, A()
class G : T, U, A()
class H : U, A(), T
class I : T, A(), U
class J : A(), U, T
class K : A(), T, U

fun box0() = "OK"

//File: tmp/tmp1.kt
package c


import b.H
import b.B
import b.C
import b.U
import b.J
import b.A
import b.E
import b.I
import b.G
import b.T
import b.K
import b.D
import b.F
data class A(val a: Any?, var x: Int)
data class B(val a: Any?)
data class C(val a: Int, var x: Int?)
data class D(val a: Int?)

fun box1(): String {
    B().foo()
    C().foo()
    D().foo()
    E().foo()
    F().foo()
    G().foo()
    H().foo()
    I().foo()
    J().foo()
    K().foo()

    return "OK"
}

//File: tmp/tmp2.kt
package a


import c.C
import c.B
import c.D
import c.A
//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

class Parser<TInput, TValue>(val f: (TInput) -> Result<TInput, TValue>) {

    operator fun invoke(input: TInput): Result<TInput, TValue> = f(input)

    fun <TIntermediate, TValue2> mapJoin(
            selector: ((TValue)?) -> Parser<TInput, (TIntermediate)?>,
            projector: ((TValue)?, (TIntermediate)?) -> TValue2
    ): (Parser<TInput, TValue2>)? {
        return Parser({ input ->
                          val res = this(input)
                          when (res) {
                              is (Result.ParseError)? -> Result.ParseError(res.productionLabel, res.child, res.rest)
                              is (Result.Value)? -> {
                                  val v = res.value
                                  val res2 = selector(v)(res.rest)
                                  when (res2) {
                                      is (Result.ParseError)? -> Result.ParseError(res2.productionLabel, res2.child, res2.rest)
                                      is (Result.Value)? -> Result.Value(projector(v, res2.value), res2.rest)
                                  }
                              }
                          }
                      })!!
    }
}

/** A parser can return one of two Results */
sealed class Result<TInput, TValue> {

    class Value<TInput, TValue>(val value: TValue, val rest: TInput) : Result<TInput, TValue>() {}

    class ParseError<T>(val productionLabel: (String)?,
                                     val child: ParseError<(TInput)?, *>?,
                                     val rest: (TInput)?) : Result<TInput, TValue>() {}
}

fun box2() : (String)? {
   if( A(null,19).hashCode() != 229077302!!.unaryMinus()) "Fail 2"
   if( A(239,19).hashCode() != (((0).times(31)).plus(94237251.unaryMinus()))) throw AssertionError()
   if( B(null).hashCode() != 659709665.unaryMinus()) "hrsyb"!!
   if( B(239).hashCode() != 10750079) "fail"
   if( C(1812524975,19)!!.hashCode() != (((239).times(0)).plus(856078847!!.unaryMinus()))) "fail"
   if( C(239,null).hashCode() != (20538785!!).times(31)) "fail"
   if( D(839693111).hashCode() != (239)) "OK"
   if( D(null).hashCode() != 1083644501!!) "sufrz"!!
   return "aupgg"
}


