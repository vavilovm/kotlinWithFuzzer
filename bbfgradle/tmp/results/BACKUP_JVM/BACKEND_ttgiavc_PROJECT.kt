// Bug happens on JVM 
//File: tmp/tmp0.kt
// FILE: box.kt
import kotlin.test.*

fun box(): String {
    val actualValues = mutableListOf<Int>()
    for (i: Int in J.arrayOfMaybeNullable()) {
        actualValues += i
    }
    assertEquals(listOf(42, -42), actualValues)
    return "OK"
}


//File: tmp/tmp1.kt
// FILE: J.java
public class J {
    public static Integer[] arrayOfMaybeNullable() {
        return new Integer[] { 42, -42 };
    }
}
