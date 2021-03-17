// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return Test.OK.getStr();
   }
}

// FILE: secondaryConstructorWithDefaultArguments.kt

// IGNORE_BACKEND_FIR: JVM_IR
enum class Test(val x: Int, val str: String) {
    OK;
    constructor(x: Int = 0) : this(x, "OK")
}

