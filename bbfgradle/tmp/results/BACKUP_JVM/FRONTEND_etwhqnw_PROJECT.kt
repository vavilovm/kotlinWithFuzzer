// Bug happens on JVM 
//File: tmp/tmp0.kt
// FILE: JavaClass.java

public class JavaClass {

    public Object minus0()
    {
        return -0.0;
    }

    public Object plus0()
    {
        return 0.0;
    }

}


//File: tmp/tmp1.kt
// FILE: b.kt

fun box(): String {
    val jClass = JavaClass()

    if ((jClass.minus0() as Double) < (jClass.plus0() as Double)) return "fail 1"

    if ((jClass.minus0() as Double) != (jClass.plus0() as Double)) return "fail 2"

    return "OK"
}
