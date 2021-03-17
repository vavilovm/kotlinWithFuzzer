// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.*
fun box()  {
assertFailsWith<IllegalArgumentException> {try
{}
finally{
        {}
    }}
}