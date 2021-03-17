// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s1 = "s";
      return Intrinsics.areEqual(s1, "s") ? "OK" : "fail";
   }
}

// FILE: kt454.kt


