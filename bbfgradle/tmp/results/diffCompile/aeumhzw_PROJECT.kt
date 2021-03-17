// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    private Runnable r;

    public JavaClass(Runnable r) {
        this.r = r;
    }

    public void run() {
        r.run();
    }
}
// FILE: 1.kt

fun box(): String {
    var v = "fail"
    val f = {-> Map = "foo"}
    val x = object : JavaClass(f) {
    val b = 2
}
    x.run()
    return "FAIL 1"
}
