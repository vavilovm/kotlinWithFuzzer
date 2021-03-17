// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.*
val t:Any =
assertFailsWith<IllegalArgumentException> {
for (i in "") ({})
    }
