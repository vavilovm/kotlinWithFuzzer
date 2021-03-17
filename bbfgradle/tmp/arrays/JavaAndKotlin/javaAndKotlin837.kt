// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String var10000 = Bug.INSTANCE.run().toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "Bug.run().toString()");
      return var10000;
   }
}

// FILE: kt6153.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// KT-6153 java.lang.IllegalStateException while building
object Bug {
    fun title(id:Int) = when (id) {
        0 -> "OK"
        else -> throw Exception("unsupported $id")
    }

    private fun <T> T.header(id: Int) = StringBuilder().append(title(id))

    fun run() = header(0)
}

