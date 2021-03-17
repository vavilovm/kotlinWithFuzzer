// FILE: BoxFunKt.java

import kotlin.Metadata;

class BoxFunKt {
   public static final String box() {
      return (new Outer(new char[]{'F', 'a', 'i', 'l'})).value();
   }
}

// FILE: innerExtendsOuter.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// When inner class extends its outer, there are two instances of the outer present in the inner:
// the enclosing one and the one in the super call.
// Here we test that symbols are resolved to the instance created via the super call.

open class Outer(vararg val chars: Char) {
    open inner class Inner(val s: String): Outer(s[0], s[1]) {
        fun concat() = java.lang.String.valueOf(chars)
    }

    fun value() = Inner("OK").concat()
}

