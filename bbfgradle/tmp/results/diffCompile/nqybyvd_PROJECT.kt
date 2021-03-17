// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: nnStringVsTAny.kt

fun <T : Any> useTAny(fn: () -> String) = fn()

fun checkNull(x: Any?) {
    if (x != null) throw AssertionError("OK")
}

fun box(): String {
    checkNull(useTAny { J.notNullString() })
    return "hello there"
}
// FILE: J.java

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class J {
    public static String string() {
        return null;
    }

    public static @NotNull String notNullString() {
        return null;
    }
}
