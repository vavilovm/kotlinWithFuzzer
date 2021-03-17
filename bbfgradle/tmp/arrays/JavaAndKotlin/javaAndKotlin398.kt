// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      long maxULong = -1L;
      long zero = 0L;
      return Long.compareUnsigned(zero, maxULong) >= 0 ? "Fail" : "OK";
   }
}

// FILE: unsignedLiteralsForMaxLongValue.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

