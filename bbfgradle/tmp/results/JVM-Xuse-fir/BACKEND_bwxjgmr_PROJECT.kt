// Bug happens on JVM -Xuse-fir
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

fun box()  {
    var v:Any = TODO()
    val f = {-> v = ""}
    val x = object : JavaClass(f) {
    var a = 0
    init {
        a++
    }
    @JvmField var b = a
    init {
        b++
    }
    val c = b
}
    x.run()
}
