// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
@OptIn(ExperimentalTypeInference::class)
fun <T> myflow(@BuilderInference suspendCoroutineUninterceptedOrReturn: T.() -> Int): T = TODO()
fun test(): Int
  =
myflow {
map
}
