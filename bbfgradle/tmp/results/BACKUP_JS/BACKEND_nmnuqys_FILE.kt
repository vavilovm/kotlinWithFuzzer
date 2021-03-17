// Bug happens on JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
fun box()   = 
    assertFailsWith<IllegalArgumentException> {
        for (i in "") ({})
    }
