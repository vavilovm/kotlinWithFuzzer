// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return State._0.ordinal() == 0 && State._1.ordinal() == 1 && State._2.ordinal() == 2 && State._3.ordinal() == 3 ? "OK" : "fail";
   }
}

// FILE: ordinal.kt

// IGNORE_BACKEND_FIR: JVM_IR
enum class State {
  _0,
  _1,
  _2,
  _3
}

