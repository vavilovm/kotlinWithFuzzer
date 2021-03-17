// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte a1 = (byte)(-1);
      short a2 = (short)(-1);
      int a3 = -1;
      long a4 = (long)(-1);
      double a5 = -1.0D;
      float a6 = -1.0F;
      if (a1 != (byte)-1) {
         return "fail 1";
      } else if (a2 != (short)-1) {
         return "fail 2";
      } else if (a3 != -1) {
         return "fail 3";
      } else if (a4 != -1L) {
         return "fail 4";
      } else if (a5 != -1.0D) {
         return "fail 5";
      } else {
         return a6 != -1.0F ? "fail 6" : "OK";
      }
   }
}

// FILE: outerCapturedInObject2.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface Callback {
    fun invoke(): String
}

open class Base(val callback: Callback)

class Outer {
    val ok = "OK"

    inner class Inner1 {
        inner class Inner2 : Base(
                object : Callback {
                    override fun invoke() = ok
                }
        )
    }
}

