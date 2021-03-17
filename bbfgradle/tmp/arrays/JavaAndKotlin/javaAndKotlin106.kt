// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      A var10000 = A.INSTANCE;
      var10000.set(0, var10000.get(0) + 1);
      var10000 = A.INSTANCE;
      var10000.set(0, var10000.get(0) + 1);
      return "OK";
   }
}

// FILE: overloadedSet.kt

// IGNORE_BACKEND_FIR: JVM_IR
object A {
    operator fun get(i: Int) = 1
    operator fun set(i: Int, j: Int) {}
    operator fun set(i: Int, x: Any) { throw Exception() }
}

