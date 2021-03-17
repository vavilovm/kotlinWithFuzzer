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

// FILE: primaryConstructor2.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

class C @kotlin.jvm.JvmOverloads constructor(s1: String, s2: String = "K") {
    public val status: String = s1 + s2
}

