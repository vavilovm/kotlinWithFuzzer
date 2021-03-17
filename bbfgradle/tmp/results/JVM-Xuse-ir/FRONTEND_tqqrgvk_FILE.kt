// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// FILE: tmp0.kt


fun interface GenericCharToAny: (y: Int ) 
 Int
box  {
GenericCharToAny {}.invoke

