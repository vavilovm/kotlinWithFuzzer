// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return Variants.Companion.getValueStr();
   }
}

// FILE: valuesInsideEnum.kt

// IGNORE_BACKEND_FIR: JVM_IR
enum class Variants {
    O, K;
    companion object {
        val valueStr = values()[0].name + Variants.values()[1].name
    }
}

