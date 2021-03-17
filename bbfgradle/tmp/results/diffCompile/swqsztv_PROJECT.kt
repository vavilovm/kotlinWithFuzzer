// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: A.java

public class A<T> {
    public interface I<T> {
        String apply(T x);
    }

    public String call(I<T> block) { return block.apply(null); }
}
// FILE: test.kt

fun f(x: Any): String {
    if (x is A<Int>) {
        // Fails in FIR due to inconsistent lambda argument type (Nothing? expected)
        return x.call { y: Any? -> "OK" }
    }
    return "Fail"
}

fun box(): String {
    return f(A<Int>())
}
