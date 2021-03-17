// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.*
fun box()  {
val y:Any = TODO()
val charList = listOf<Char>()
assertEquals( 
 {
val i = ('a'..'j').iterator().next()
charList += i
},TODO()
)
}