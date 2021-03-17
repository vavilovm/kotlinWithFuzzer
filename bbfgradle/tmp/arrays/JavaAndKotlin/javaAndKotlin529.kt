// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (1L != 1L) {
         return "fail 1";
      } else if (1L != 1L) {
         return "fail 2";
      } else if (1L != 1L) {
         return "fail 3";
      } else if (1L != 1L) {
         return "fail 4";
      } else {
         return 1L != 1L ? "fail 5" : "OK";
      }
   }
}

// FILE: kt1739.kt

// IGNORE_BACKEND: JS_IR
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

public class RunnableFunctionWrapper(val f : () -> Unit) : Runnable {
    public override fun run() {
        f()
    }
}

