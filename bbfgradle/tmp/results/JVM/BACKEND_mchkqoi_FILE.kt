// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


class Outer<X> {
    inner class Inner<Y> 
}
fun <X
> wrapN(xy : Outer<@ExperimentalAssociatedObjects
X>.Inner<Int>): Int = TODO()

