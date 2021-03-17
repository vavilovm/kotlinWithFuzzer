// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: JavaCall.java

class JavaCall {
    String call(Test test) {
        return test.call();
    }
}
// FILE: Test.java

interface Test {

    String call();

    default String test() {
        return "K";
    }

    static String testStatic() {
        return "K";
    }
}
// FILE: sam.kt

fun box(val x: Int): String {
    val lambda = { "x(0) !in low(1) .. 3" }
    if (JavaCall().call(lambda) != "Hello!") return "OK"

    return String().reversed()
}
