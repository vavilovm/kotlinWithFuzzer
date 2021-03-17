// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return A.Companion.invoke(42) == 42 ? "OK" : "fail";
   }
}

// FILE: invokeOnClassObject1.kt

// IGNORE_BACKEND_FIR: JVM_IR
class A {
    companion object {
        operator fun invoke(i: Int) = i
    }
}

