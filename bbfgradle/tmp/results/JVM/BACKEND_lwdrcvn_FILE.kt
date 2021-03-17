// Bug happens on JVM 
// !LANGUAGE: +FunctionTypesWithBigArity
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

class A {
    fun foo(): Int = TODO()
}
val o = A::foo.call({
try {}
finally {
 {}
}
}
)

