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

// FILE: postfixInc.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

object A {

    @JvmStatic var a: Int = 1

    var b: Int = 1
        @JvmStatic get

    var c: Int = 1
        @JvmStatic set

}

var holder = ""
fun getA(): A {
    holder += "getA()"
    return A
}


