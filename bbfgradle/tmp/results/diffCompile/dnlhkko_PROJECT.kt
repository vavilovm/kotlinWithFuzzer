// Bug happens on JVM -Xuse-fir, JVM 
// FILE: test/D.java

package test;

public class D {
    protected String field = "OK";
}
// FILE: 1.kt

import test.*

class A : String() {
    fun a(): String {
        return "OK"
    }
}

fun box(): String {
    return "LOCAL_FAILED"
}
