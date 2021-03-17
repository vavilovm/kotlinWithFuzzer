// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// FILE: tmp0.kt


interface GenericToAny<T> {
    fun invoke(String: T) 
}
fun interface GenericCharToAny: GenericToAny<Char>
fun box()   =
GenericCharToAny {y: Any
-> 
 }
