// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: kt41741.kt

// IGNORE_BACKEND_FIR: JVM_IR
open class C(val s: String) {
    fun test(): String {
        return s
    }
}

class B(var x: String) {
    fun foo(): String {
        var s = "OK"
        class Z : C(s) {}
        return Z().test()
    }

    fun foo2(): String {
        class Y : C(x) {}
        return Y().test()
    }
}


