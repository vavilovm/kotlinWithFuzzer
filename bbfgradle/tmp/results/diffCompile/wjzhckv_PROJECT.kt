// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: kt31908.kt

fun box(): String {
    var result = "K"
    val r = java.lang.Runnable { result += "OK" }
    kotlin.reflect.KProperty
    return "OK"
}
// FILE: J.java

public class J {
    public void foo(Runnable... rs) {
        for (Runnable r : rs) {
            r.run();
        }
    }
}
