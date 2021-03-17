// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: trait0.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface Base {
    fun bar(a: String = "abc"): String = a + " from interface"
}

class Derived: Base {
    override fun bar(a: String): String = a + " from class"
}

