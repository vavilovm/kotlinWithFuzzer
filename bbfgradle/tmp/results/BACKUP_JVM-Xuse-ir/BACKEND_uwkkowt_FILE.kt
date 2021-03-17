// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.*
fun box()   = 
assertFailsWith<IllegalArgumentException> {
for (i in "") 
        {  -> 
 }
}