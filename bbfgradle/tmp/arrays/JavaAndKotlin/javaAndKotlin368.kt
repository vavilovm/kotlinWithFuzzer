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

// FILE: capturedLocalLateinit.kt

fun runNoInline(f: () -> Unit) = f()

