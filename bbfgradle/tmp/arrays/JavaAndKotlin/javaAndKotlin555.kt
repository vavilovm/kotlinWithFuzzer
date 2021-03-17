// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: infixRecursiveCall1.kt

// !DIAGNOSTICS: -UNUSED_PARAMETER

// DONT_RUN_GENERATED_CODE: JS

tailrec infix fun Int.foo(x: Int) {
    if (x == 0) return
    val xx = x - 1
    return 1 foo xx
}

