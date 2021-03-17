// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.*
val v:Any =
assertEquals( {for (i in "") {
        {}
    }},TODO())
