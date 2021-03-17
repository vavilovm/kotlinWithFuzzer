// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: companionObjectInEnum.kt

// IGNORE_BACKEND_FIR: JVM_IR
enum class Game {
    ROCK,
    PAPER,
    SCISSORS;

    companion object {
        fun foo() = ROCK
        val bar = PAPER
        val values2 = values()
        val scissors = valueOf("SCISSORS")
    }
}

