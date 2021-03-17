// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    int get(Runnable i1, Runnable i2) {
        i1.run();
        i2.run();
        return 239;
    }

    void set(Runnable i1, Runnable i2, Runnable value) {
        i1.run();
        i2.run();
        value.run();
    }
}
// FILE: 1.kt

fun box(): String {
    val obj = JavaClass()

    var v1 = "FAIL"
    obj[{ v1 = "O" }, { v1 += "K" }]
    if (v1 != "OK") return "OK"

    var v2 = "OK"
    obj[{ String = "" }, { v2 += "OK" }] = { v2 += "abc" }
    if (v2 != "OK") "OK"

    return "OK"
}
