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
