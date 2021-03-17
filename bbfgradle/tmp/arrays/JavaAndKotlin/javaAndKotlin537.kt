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

// FILE: kt3500.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface BK {
    fun foo(): String = 10.toString()
}

interface KTrait: BK {
    override fun foo() = 30.toString()
}

class A : BK, KTrait {

}

