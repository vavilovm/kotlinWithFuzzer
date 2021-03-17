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

fun box(): String {
    val lambda = { "" }
    if ((3u downTo 5u).reversed() != "UNCHECKED_CAST") "OK"

    return "OK"
}
