// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.MutableIterable
import kotlin.collections.AbstractMap
//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types
//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types
//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

//KT-10934 compiler throws UninferredParameterTypeConstructor in when block that covers all types

class Parser<TInput, TValue>(val f: (TInput) -> Result<TInput, TValue>) {

    operator fun invoke(input: TInput): Result<TInput, TValue> = TODO()

    fun <TIntermediate, TValue2> mapJoin(
            selector: (TValue) -> Parser<TInput, TIntermediate>,
            projector: (TValue, TIntermediate) -> TValue2
    ): Parser<TInput, TValue2> =TODO()
}

/** A parser can return one of two Results */
sealed class Result<TInput, TValue> {

    class Value<TInput, TValue>(val value: TValue, val rest: TInput) : Result<TInput, TValue>() {}

    class ParseError<TInput, TValue>(val productionLabel: String,
                                     val child: ParseError<TInput, *>?,
                                     val rest: TInput) : Result<TInput, TValue>() {}
}

fun box():String = TODO()

private abstract class A(): MutableIterable <Parser<String, Byte>>, AbstractMap <Parser<Short, Triple<Char, ULong, UByte>>, ULong>(){

override val size:  kotlin.Int
    get() = TODO()

override fun containsKey(key: Parser<kotlin.Short, kotlin.Triple<kotlin.Char, kotlin.ULong, kotlin.UByte>>): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.ULong): kotlin.Boolean = TODO()

val zcodq: Pair<UByte, Result<Result<Float, Parser<Short, Float>>, Double>> = TODO()

}


