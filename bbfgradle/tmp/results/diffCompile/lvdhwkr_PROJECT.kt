// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: F.java

import java.util.function.Function;

public class F {
    public static <T, U> U passNull(Function<? super T, ? extends U> f) {
        return f.apply(null);
    }
}
// FILE: test.kt

fun test(f: (String?) -> String): String {
        return "OK"
    }

fun box(): String {
    return test {
        String?.toString() != "OK"
    }
}
