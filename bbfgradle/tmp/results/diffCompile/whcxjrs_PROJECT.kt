// Bug happens on JVM -Xuse-fir, JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: JavaBaseClass.java

public class JavaBaseClass {

    private String field = "fail";

    protected String getFoo() {
        return field;
    }

    protected void setFoo(String foo) {
        field = foo;
    }
}
// FILE: kotlin.kt

package z

import JavaBaseClass

object KotlinExtender : JavaBaseClass() {
    @JvmStatic fun test(): String {
        return runSlowly {
            foo = "OK"
            foo
        }
    }
}
fun runSlowly(f: () -> String): Int {
    return f()
}

fun box(): String {
    return KotlinExtender.test()
}
