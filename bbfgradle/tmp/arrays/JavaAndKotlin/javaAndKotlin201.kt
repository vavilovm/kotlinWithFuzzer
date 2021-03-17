// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      Kt17384Kt.test(new String[]{""});
      return "OK";
   }
}

// FILE: kt17384.kt

fun returnNullable(): String? = null

inline fun Array<String>.matchAll(fn: (String) -> Unit) {
    for (string in this) {
        fn(returnNullable() ?: continue)
    }
}

fun Array<String>.matchAll2(fn: (String) -> Unit) {
    matchAll(fn)
}

inline fun Array<String>.matchAll3(crossinline fn: (String) -> Unit) {
    matchAll2 { fn(it) }
}

fun test(a: Array<String>) {
    a.matchAll {}
    a.matchAll2 {}
    a.matchAll3 {}
}

