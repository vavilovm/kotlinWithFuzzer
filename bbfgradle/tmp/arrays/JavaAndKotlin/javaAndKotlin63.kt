// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return String.valueOf(12).equals("13") ? "Fail" : "OK";
   }
}

// FILE: ea35953.kt


