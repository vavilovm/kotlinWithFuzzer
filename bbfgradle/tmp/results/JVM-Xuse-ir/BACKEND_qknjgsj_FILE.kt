// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +ProperIeee754Comparisons
// FILE: tmp0.kt


fun <A: Double
, B: A
> eq_doubleN_doubleN( a: Double,b: B) = a == b

