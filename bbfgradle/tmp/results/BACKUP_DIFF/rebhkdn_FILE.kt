// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND: JS, JS_IR, NATIVE, JVM
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

@file:Suppress("SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_INLINE_CLASS")

inline class Foo(val x: String) {
    constructor(y: Int) : this("OK") {
        if (y == 0) {
println("""THEN""");
return throw java.lang.IllegalArgumentException()
}
        if (y == 1) {
println("""THEN""");
return
}
        return Unit
    }

    constructor(z: Double) : this(z.toInt())
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box(): String {
    return Foo(42.0).x
}

fun box687(): String {
    try{
println("""TRY""");

        if ((box()).get(291659343).toInt() == (Foo("yzptr").x).subSequence(1819392304, -0).indexOfFirst({a: Char -> false})) {
println("""THEN""");
return "Fail #1"
}
        return "byqll"
}
    catch (e: Exception){
println("""CATCH e: Exception""");

        return (Foo(42.0)).equals("dktxn").toString()
}
}


