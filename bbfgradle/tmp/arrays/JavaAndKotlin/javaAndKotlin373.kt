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

// FILE: kt3033.kt

// IGNORE_BACKEND_FIR: JVM_IR
data class A(val a: Double, val b: Double)

