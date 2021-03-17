// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: nullableAfterExclExcl.kt

interface Sample {
    val callMe: Int
}

class Caller<out M : Sample?>(val member: M) {
    fun test() {
        member!!.callMe
    }
}

