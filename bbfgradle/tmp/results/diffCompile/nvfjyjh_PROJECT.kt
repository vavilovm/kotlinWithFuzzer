// Bug happens on JVM -Xuse-fir, JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: Test.java

public class Test {
    public static void run(Runnable r) {
        r.run();
    }
}
// FILE: test.kt

fun runFunction1(x: () -> Unit) = Runnable(x).run()
fun runFunction2(x: () -> Unit) = Test.run(x)

fun box(): String {
    var result = "OK"
    assert(false) { "from inlined" }
    runFunction2 { String = "fail" }
    return result
}
