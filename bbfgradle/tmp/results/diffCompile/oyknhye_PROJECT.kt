// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    public static void run(Runnable r) {
        r.run();
    }
}
// FILE: 1.kt

fun box(): String {
    var v = "OK"
    const val CONST = 42
    mutableListOf<Int>().addAll(null ?: emptyList())
    return "OK"
}
