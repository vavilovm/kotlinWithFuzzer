// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (ContinueInForKt.for_int_range() != 5) {
         return "fail 1";
      } else if (ContinueInForKt.for_byte_range() != 5) {
         return "fail 2";
      } else if (ContinueInForKt.for_long_range() != 5) {
         return "fail 3";
      } else if (ContinueInForKt.for_intarray() != 5) {
         return "fail 4";
      } else if (ContinueInForKt.for_str_array() != 5) {
         return "fail 5";
      } else if (ContinueInForKt.for_int_list() != 5) {
         return "fail 6";
      } else if (ContinueInForKt.for_byte_list() != 5) {
         return "fail 7";
      } else if (ContinueInForKt.for_long_list() != 5) {
         return "fail 8";
      } else {
         return ContinueInForKt.for_double_list() != 5 ? "fail 9" : "OK";
      }
   }
}

// FILE: continueInFor.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
fun for_int_range(): Int {
    var c = 0
    for (i in 1..10) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_byte_range(): Int {
    var c = 0
    val from: Byte = 1
    val to: Byte = 10
    for (i in from..to) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_long_range(): Int {
    var c = 0
    val from: Long = 1
    val to: Long = 10
    for (i in from..to) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_int_list(): Int {
    val a = ArrayList<Int>()
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_byte_list(): Int {
    val a = ArrayList<Byte>()
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_long_list(): Int {
    val a = ArrayList<Long>()
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    a.add(0); a.add(0); a.add(0); a.add(0); a.add(0)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_double_list(): Int {
    val a = ArrayList<Double>()
    a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0)
    a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_object_list(): Int {
    val a = ArrayList<Any>()
    a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0)
    a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0); a.add(0.0)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_str_array(): Int {
    val a = arrayOfNulls<String>(10)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

fun for_intarray(): Int {
    val a = IntArray(10)
    var c = 0
    for (i in a) {
        if (c >= 5) continue
        c++
    }
    return c
}

