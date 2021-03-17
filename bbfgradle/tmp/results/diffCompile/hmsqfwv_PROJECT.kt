// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

import java.util.*;

class JavaClass {
    public static void sortIntList(List<Integer> list, Comparator<Integer> comparator) {
        Collections.sort(list, comparator);
    }
}
// FILE: 1.kt

import java.util.*

fun box(): String {
    val list = ArrayList(Arrays.asList(3, 2, 1, 8, 1, 5))
    val expected = ArrayList()

    val f = { a: Int, b: Int -> b - a }
    JavaClass.sortIntList(list, f)
    return "OK"
}
