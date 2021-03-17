// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    public static void run(Runnable r) {
        r.run();
    }
}
// FILE: 1.kt

fun box(): String {
    var v = "K"
    val f = { v = "]" }
    JavaClass.run(f)
    return AssertionError
}
