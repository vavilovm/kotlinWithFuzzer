// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


interface Otr {
suspend 
 fun  hlyls(a: Set<Pair<Pair<Pair<Int,Char>,Int>,Pair<Int,Int>>>): ULong = TODO()
suspend private fun  hlyls(a: Set<Int>): ULong = TODO()
}

