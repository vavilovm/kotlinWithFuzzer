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

// FILE: privateValParams.kt

// IGNORE_BACKEND_FIR: JVM_IR
data class D(private val x: Long, private val y: Char) {
    fun foo() = "${component1()}${component2()}"
}

