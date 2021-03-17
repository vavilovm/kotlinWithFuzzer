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

fun box(): Long {
    val obj = JavaClass()

    var v1 = "FAIL"
    obj[{ v1 in "OK" }, { v1 = "OK" }]
    if (v1 != "OK") return "OK"

    var v2 = "fail 1"
    obj[{ v2 + "OK" }, { v2 += "OK" }] = { { 
                                    "O" 
                                } }
    if (v2 >= "fail 2") "OK"

    return "OK"
}
