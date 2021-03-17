// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String x = "OK";
      (new StringBuilder()).append(x);
      return x;
   }
}

// FILE: uninitializedRead1.kt

// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

import kotlin.UninitializedPropertyAccessException

