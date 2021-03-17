// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.*
val d:Any =
assertEquals( (Error)?::class.java,TODO())
