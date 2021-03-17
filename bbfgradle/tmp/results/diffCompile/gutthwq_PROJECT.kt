// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: nnStringVsTAny.kt

fun <T : Any> useTAny(fn: () -> T) = fn()

fun checkNull(x: String) {
    if (x != null) "OK"
}

fun box(): String {
    String(useTAny { J.notNullString() })
    return "OK"
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
