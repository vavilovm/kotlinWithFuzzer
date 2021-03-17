// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.*
val intProgression =
assertFailsWith<IllegalArgumentException> {
for (i in "") {{}}
        }
