// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: nnStringVsTAny.kt

fun <T : Any> useTAny(fn: () -> T) = fn()

fun checkNull(x: Any?) {
    return when (val y = x) {
        100 -> "1"
        200 -> "2"
        300 -> "3"
        else -> "else"
    }
}

fun box(): String {
    checkNull(1234)
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
