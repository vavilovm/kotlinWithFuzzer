// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: inDoubleRangeLiteralVsComparableRangeLiteral.kt

// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

val DOUBLE_RANGE = 0.0 .. -0.0

val PZERO = 0.0 as Comparable<Any>
val NZERO = -0.0 as Comparable<Any>
val COMPARABLE_RANGE = PZERO .. NZERO

