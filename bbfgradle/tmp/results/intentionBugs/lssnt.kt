// PSI ERROR. Modified in 128
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
// // !LANGUAGE: +InlineClasses
// 
// inline class A(val x: Int = 0){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// var i = 0
// 
// tailrec fun set1(): A {
//     i = 1
//     return A()
// }
// 
// fun test1(n: Int): A {
//     if (i != 1)
//         {
// println("""THEN""");
// throw IllegalStateException("Fail $n")
// }
//     i = 0
//     return A()
// }
// 
// fun set1Boxed(): Any? = set1()
// fun test1Boxed(n: Int): Any? = test1(n)
// 
// fun box(): String {
//     try{
// println("""TRY""");
// 
//         set1() == test1(1)
//         set1Boxed() == test1(2)
//         set1() == test1Boxed(3)
//         set1Boxed() == test1Boxed(4)
// } catch (e: IllegalStateException){
// println("""CATCH e: IllegalStateException""");
// 
//         return e.message ?: "Fail no message"
// }
//     return "OK"
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: EXCEPTIONS_NOT_IMPLEMENTED
// !LANGUAGE: +InlineClasses

inline class A( x: Int = 0){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

var i = 0

tailrec fun set1(): A {
    i = 1
    return A()
}

fun test1(n: Int): A {
    if (i != 1)
        {
println("""THEN""");
throw IllegalStateException("Fail $n")
}
    i = 0
    return A()
}

fun set1Boxed(): Any? = set1()
fun test1Boxed(n: Int): Any? = test1(n)

fun box(): String {
    try{
println("""TRY""");

        set1() == test1(1)
        set1Boxed() == test1(2)
        set1() == test1Boxed(3)
        set1Boxed() == test1Boxed(4)
} catch (e: IllegalStateException){
println("""CATCH e: IllegalStateException""");

        return e.message ?: "Fail no message"
}
    return "OK"
}

