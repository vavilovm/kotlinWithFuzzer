// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: bridgeInInterface1.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8

interface Test<T> {
    fun test(p: T): T {
        return p
    }
}

interface Test2: Test<String> {
    override fun test(p: String): String {
        return p + "K"
    }
}

class TestClass : Test2 {
}

fun <T> execute(t: Test<T>, p: T): T {
    return t.test(p)
}

