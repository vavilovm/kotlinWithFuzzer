// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt


import kotlin.experimental.ExperimentalTypeInference
interface Kl0<T>
class Kl1<T> : Kl0<Int>
@OptIn(ExperimentalTypeInference::class)
fun <T> f0(@BuilderInference par1: Kl1<T>.() -> Int): T = TODO()
fun f1(): Any  =
f0 {
(1 to mutableMapOf(1 to ""    )    )-1
    }

