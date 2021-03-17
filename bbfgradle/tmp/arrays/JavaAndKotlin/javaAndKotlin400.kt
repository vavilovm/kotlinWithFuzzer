// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      long maxULong = -1L;
      long zero = 0L;
      return Long.compareUnsigned(zero, maxULong) >= 0 ? "Fail" : "OK";
   }
}

// FILE: localCapturedInLambdaInInnerClassInLocalClass.kt

// IGNORE_BACKEND_FIR: JVM_IR
open class Base(val fn: () -> String)

