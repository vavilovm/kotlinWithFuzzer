// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
@OptIn(ExperimentalTypeInference::class)     
 fun <T> myflow(@BuilderInference block: T.() -> Int): T = TODO()
fun test(): Int
 {
return myflow {
map
}
}
