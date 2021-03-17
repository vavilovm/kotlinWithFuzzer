// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.*
val v:Any =
assertEquals( {for (i in "") {
        {}
    }},TODO())
