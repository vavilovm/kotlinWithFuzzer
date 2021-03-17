// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s = (String)null;

      try {
         Intrinsics.checkNotNull(s);
         return "Fail: NPE should have been thrown";
      } catch (Throwable var2) {
         return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(var2.getClass()), Reflection.getOrCreateKotlinClass(NullPointerException.class)) ^ true ? "Fail: exception class should be NPE: " + Reflection.getOrCreateKotlinClass(var2.getClass()) : "OK";
      }
   }
}

// FILE: callableReferences.kt

// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS
// IGNORE_BACKEND: NATIVE

// WITH_RUNTIME

import kotlin.reflect.KCallable
import kotlin.test.*

class M {
    fun foo() {}
    val bar = 1
}

fun topLevelFun() {}
val topLevelProp = ""

fun <T> checkEquals(x: KCallable<T>, y: KCallable<T>) {
    assertEquals(x, y)
    assertEquals(y, x)
    assertEquals(x.hashCode(), y.hashCode())
}

fun checkToString(x: KCallable<*>, expected: String) {
    assertEquals(expected + " (Kotlin reflection is not available)", x.toString())
}

