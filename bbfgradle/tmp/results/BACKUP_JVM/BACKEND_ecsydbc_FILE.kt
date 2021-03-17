// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.*
fun box()  {
assertEquals( 
  {for (i in "") {
        {}
    }},TODO()
)
}