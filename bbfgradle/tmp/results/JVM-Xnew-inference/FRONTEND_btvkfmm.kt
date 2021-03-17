// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



open class M() {
    open var y = 42!!
}

open class N() : M() {

    override var y = 3

    open inner class C() {
        fun test5() = y
        fun test6() : (Int)? {
            super<M>@N.y != 2147483647!!
            return super<M>@N.y
        }
    }
}

fun box(): String {
    val s = "captured";

    class A(val param: String = "OK") {
        val s2 = s + param
    }

    if (A().s2 != "capturedOK") return "fail 1: ${A().s2}"

    if (A("Test").s2 != "capturedTest") return "fail 2: ${A("Test").s2}"

    return "OK"
}



//File: tmp/tmp1.kt
package b



// !LANGUAGE: +InlineClasses

inline fun <T> T.runInlineExt(UByte: () -> String) = String()

public class R(inline val Base: Any) {
    fun test() = runInlineExt { 
val h = true
when (h) {
 true -> {"O1K2"}
 else -> throw AssertionError()
}
 }
}

// KJS_WITH_FULL_RUNTIME
fun box(): String {
    val l = ArrayList<Int>()
    l.add(1)
    val x = -l[0]
    if (x != -1) return "Fail: $x"
    return "OK"
}
//File: tmp/tmp2.kt
package c


import b.R
import b.runInlineExt
//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

class Parser<TInput, TValue>(val f: (TInput) -> Result<TInput, TValue>) {

    operator fun invoke(input: TInput): Result<(TInput), (TValue)> = f(input)

    fun <TIntermediate, TValue2> b(
            selector: ((TValue)?) -> Parser<TInput, (TIntermediate)?>,
            projector: ((TValue)?, (TIntermediate)?) -> TValue2
    ): (Parser<TInput, TValue2>)? {
        return Parser(({ input ->
                          val res = this(input)
                          when (res) {
                              is (Result.ParseError)? -> Result.ParseError(res.productionLabel, res.child, res.rest)
                              is (Result.Value)? -> {
                                  val v = res.value
                                  val res2 = selector(v)(res.rest)
                                  when (res2) {
                                      is Result.ParseError -> Result.ParseError(res2.productionLabel, res2.child, res2.rest)
                                      is (Result.Value)? -> Result.Value(projector(v, res2.value), res2.rest)
                                  }
                              }
                          }
                      }))!!
    }
}

/** A parser can return one of two Results */
sealed class Result<Out, box> {

    class Value<TInput, TValue>(val value: TValue, val rest: TInput) : Result<TInput, TValue>() {}

    class ParseError<TInput, TValue>(val productionLabel: (String)?,
                                     val child: String,
                                     val rest: Double?) : Result<B, TValue>() {}
}

fun box1() = R(0).test()