// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.io.Closeable
class TestLocal : Closeable {
fun nonLocalWithFinally()   =
use {
try {}
finally{
{}
}
        }
override fun close() = TODO()
}

