// Bug happens on JVM -Xuse-fir, JVM 
// FILE: J.java

public class J {
    public static void g(Runnable r) {
        r.run();
    }
}
// FILE: test.kt

fun box(): Int {
    val testMethod = Class.forName("Test\$DefaultImpls").declaredMethods.single()
    val parameters = testMethod.getParameters()

    if (!parameters[0].isSynthetic()) return "wrong modifier on receiver parameter: ${parameters[0].modifiers}"

    if (parameters[1].modifiers != 0) return "wrong modifier on value parameter: ${parameters[1].modifiers}"

    return parameters[1].name
}
