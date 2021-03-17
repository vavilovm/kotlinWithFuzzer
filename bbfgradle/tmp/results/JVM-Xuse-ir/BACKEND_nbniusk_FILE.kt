// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
fun box()   =
assertFailsWith<IllegalArgumentException> {
try {}
finally {
 {}
}
}
