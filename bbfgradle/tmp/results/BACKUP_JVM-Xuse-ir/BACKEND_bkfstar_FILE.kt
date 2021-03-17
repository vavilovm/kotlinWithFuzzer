// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.test.assertEquals
val p0:Any = TODO()
fun box()   = 
    assertEquals( TODO(),(::p0)!!.call)
