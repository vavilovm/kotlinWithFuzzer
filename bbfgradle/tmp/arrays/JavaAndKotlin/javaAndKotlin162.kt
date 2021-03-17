// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: taintedValues.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

// Just make sure there's no VerifyError

fun getOrElse() =
        mapOf<String, Int>().getOrElse("foo") { 3 }

fun isNotEmpty(l: ArrayList<Int>) =
        l.iterator()?.hasNext() ?: false

