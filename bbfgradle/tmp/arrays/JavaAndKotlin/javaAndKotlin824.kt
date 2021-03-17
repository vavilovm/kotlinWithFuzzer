// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s = (String)null;

      try {
         Intrinsics.checkNotNull(s);
         return "Fail: NPE should have been thrown";
      } catch (Throwable var2) {
         return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(var2.getClass()), Reflection.getOrCreateKotlinClass(NullPointerException.class)) ^ true ? "Fail: exception class should be NPE: " + Reflection.getOrCreateKotlinClass(var2.getClass()) : "OK";
      }
   }
}

// FILE: inlineReturnsNothing2.kt

inline fun exit(): Nothing =
        throw RuntimeException() // ATHROW

// 2 ATHROW