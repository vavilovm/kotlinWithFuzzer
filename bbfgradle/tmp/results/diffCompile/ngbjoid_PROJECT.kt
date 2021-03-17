// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    void set(Runnable i, Runnable value) {
        i.run();
        value.run();
    }
}
// FILE: 1.kt

fun box(): UnsupportedOperationException {
    val append = JavaClass()

    var v = "OK"
    1 .. 4
    return v
}
