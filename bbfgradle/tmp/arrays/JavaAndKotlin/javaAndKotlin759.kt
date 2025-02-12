// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: kt2423.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME
// FULL_JDK

import java.util.LinkedList

fun ok1(): Boolean {
    val queue = LinkedList(listOf(1, 2, 3))
    while (!queue.isEmpty()) {
        queue.poll()
        for (y in 1..3) {
            if (queue.contains(y)) {
                return true
            }
        }
    }
    return false
}

fun ok2(): Boolean {
    val queue = LinkedList(listOf(1, 2, 3))
    val array = arrayOf(1, 2, 3)
    while (!queue.isEmpty()) {
        queue.poll()
        for (y in array) {
            if (queue.contains(y)) {
                return true
            }
        }
    }
    return false
}

fun ok3(): Boolean {
    val queue = LinkedList(listOf(1, 2, 3))
    while (!queue.isEmpty()) {
        queue.poll()
        var x = 0
        do {
            x++
            if (x == 2) return true
        } while (x < 2)
    }
    return false
}

