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
    var v = "FAIL"
    val f = {-> v = "OK"}
    val x = object : JavaClass(f) {
        class B {
            var hit = false

            init {
                assert({ hit = true; true }())
            }
        }
    }
    x.run()
    return v
}
