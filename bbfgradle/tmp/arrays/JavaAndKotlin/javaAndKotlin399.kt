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

// FILE: annotatedAnnotationParameter.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// WITH_RUNTIME

import kotlin.test.assertEquals

annotation class Name(val value: String)

annotation class Anno(
    @get:Name("O") val o: String,
    @get:Name("K") val k: String
)

