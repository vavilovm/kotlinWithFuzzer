// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: functionsWithDifferentNullabilityDoNotClash.kt

// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR

inline class Id(val id: String)

fun test(id: Id) {
    if (id.id != "OK") throw AssertionError()
}

fun test(id: Id?) {
    if (id != null) throw AssertionError()
}

