// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return String.valueOf(12).equals("13") ? "Fail" : "OK";
   }
}

// FILE: nameClash1.kt

// IGNORE_BACKEND_FIR: JVM_IR

fun test(b: Boolean): String {
    if (b) {
        fun result() = "OK"
        return result()
    } else {
        fun result() = "Fail"
        return result()
    }
}
