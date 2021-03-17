// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp.kt


inline class Foo(val x: Int) {
@Suppress("SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_INLINE_CLASS")
    constructor() : this(1) {
toString().subSequence(TODO() )
}
}

