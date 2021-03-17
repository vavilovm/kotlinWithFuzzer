// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int z = 1;
      return "OK" + z;
   }
}

// FILE: capturedInInlineOnlyCAO.kt

// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

