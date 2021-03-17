// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


class Outer<X> {
    inner class Inner<Y> 
}
fun <X
> wrapN(xy : Outer<@Int
X>.Inner<Int>): Int = TODO()

