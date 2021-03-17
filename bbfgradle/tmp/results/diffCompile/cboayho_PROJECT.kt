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
    var v = "FAIL 1"
    val x = object : JavaClass({-> v = "OK"}) {
    override val kind : String = "Physical"

    override val kind2 : String = " kind2"
}
    x.run()
    return v
}
