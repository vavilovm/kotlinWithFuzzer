// Bug happens on JVM 
//File: tmp/tmp0.kt

import java.util.*
import kotlin.test.assertEquals
fun box()  {
when (AbstractMap::class) {
 when (true) {
 {}!!!! -> 1
 else -> TreeMap::class
} -> assertEquals( TODO(),TODO())
}
}
