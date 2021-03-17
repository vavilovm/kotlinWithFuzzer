// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return Kt2151Kt.foo();
   }
}

// FILE: kt2151.kt

fun foo(): String {
    return if (true) {
        var x = "OK"
        fun foo() { x += "fail" }
        x
    } else "fail"
}

