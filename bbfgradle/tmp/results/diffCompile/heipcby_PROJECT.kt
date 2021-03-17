// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    void set(Runnable i, Runnable value) {
        i.run();
        value.run();
    }
}
// FILE: 1.kt

fun box(): String {
    val obj = JavaClass()

    var v = "fail in postfix increment: "
    obj[{ v = "OK" }] = { v += "OK" }
    return it
}
