// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s = "s";
      s = s + 1;
      return Intrinsics.areEqual(s, "s1") ? "OK" : "fail";
   }
}

// FILE: useAnonymousObjectAsIterator.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KT-5869

operator fun <T> Iterator<T>.iterator(): Iterator<T> = this

