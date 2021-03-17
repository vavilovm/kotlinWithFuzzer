// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: kt2895.kt

// IGNORE_BACKEND_FIR: JVM_IR
fun outer() {
    fun inner(i: Int) {
        if (i > 0){
            {
                it: Int -> inner(0) // <- invocation of literal itself is generated instead
            }.invoke(1)
        }
    }
    inner(1)
}

