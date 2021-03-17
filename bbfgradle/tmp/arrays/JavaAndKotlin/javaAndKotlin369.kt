// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String x = "OK";
      (new StringBuilder()).append(x);
      return x;
   }
}

// FILE: kt4173_2.kt

// IGNORE_BACKEND_FIR: JVM_IR
open class X(var s: ()-> Unit)

open class C(val f: X) {
    fun test() {
        f.s()
    }
}

class B(var x: Int) {
    fun foo() {
        object : C(object: X({x = 3}) {}) {}.test()
    }
}


