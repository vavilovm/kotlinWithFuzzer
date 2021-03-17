// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: smartCastToDifferentTypes_properIeeeComparisons.kt

// !LANGUAGE: +ProperIeee754Comparisons
// IGNORE_BACKEND_FIR: JVM_IR

fun ne(x: Any, y: Any) = x is Double && y is Float && x != y
fun lt(x: Any, y: Any) = x is Double && y is Float && x < y
fun gt(x: Any, y: Any) = x is Double && y is Float && x > y

