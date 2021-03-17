// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: genericNull2.kt

// IGNORE_BACKEND_FIR: JVM_IR
data class A<T>(val t: T)

