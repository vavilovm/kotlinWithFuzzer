// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int z = 1;
      return "OK" + z;
   }
}

// FILE: receiverEvaluatedOnce1.kt

// !LANGUAGE: +NewInference +FunctionalInterfaceConversion +SamConversionPerArgument +SamConversionForKotlinFunctions
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS
// WITH_RUNTIME
// SKIP_DCE_DRIVEN

fun interface KRunnable {
    fun invoke()
}

fun runTwice(r: KRunnable) {
    r.invoke()
    r.invoke()
}

class A() {
    fun f() {}
}

