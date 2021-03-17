// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return Foo.FOO.getCallback().invoke();
   }
}

// FILE: kt20651b.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface Callback {
    fun invoke(): String
}

enum class Foo(
        val x: String,
        val callback: Callback
) {
    FOO(
            "OK",
            object : Callback {
                override fun invoke() = FOO.x
            }
    )
}

