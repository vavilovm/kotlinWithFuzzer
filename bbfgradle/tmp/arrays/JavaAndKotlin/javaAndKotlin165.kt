// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: labeledDeclarations.kt

// IGNORE_BACKEND_FIR: JVM_IR
data class A(val a: Int, val b: Int)

