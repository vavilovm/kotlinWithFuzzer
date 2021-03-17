// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.*
val z:Any =
assertEquals( {for (i in "") ({})},TODO())
