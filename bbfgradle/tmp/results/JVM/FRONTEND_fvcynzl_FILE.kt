// Bug happens on JVM 
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// FILE: tmp0.kt


fun interface GenericCharToAny: (y: Int ) 
 Int
box  {
GenericCharToAny {}.invoke

