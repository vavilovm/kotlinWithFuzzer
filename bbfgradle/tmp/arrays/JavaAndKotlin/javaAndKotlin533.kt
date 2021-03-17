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

// FILE: underscoreNames.kt

// IGNORE_BACKEND_FIR: JVM_IR
class A {
    operator fun component1() = "O"
    operator fun component2(): String = throw RuntimeException("fail 0")
    operator fun component3() = "K"
}

fun foo(a: A, block: (A) -> String): String = block(a)

