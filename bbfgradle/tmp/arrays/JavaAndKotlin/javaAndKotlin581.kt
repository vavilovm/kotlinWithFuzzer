// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte var3 = 1;
      IntProgression var10000 = RangesKt.step(RangesKt.step((IntProgression)(new IntRange(var3, 8)), 2), 2);
      int i = var10000.getFirst();
      int var1 = var10000.getLast();
      int var2 = var10000.getStep();
      if (var2 >= 0) {
         if (i > var1) {
            return "OK";
         }
      } else if (i < var1) {
         return "OK";
      }

      while(i != var1) {
         i += var2;
      }

      return "OK";
   }
}

// FILE: functionLiteralGenericSignature.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

import java.util.Date

fun assertGenericSuper(expected: String, function: Any?) {
    val clazz = (function as java.lang.Object).getClass()!!
    val genericSuper = clazz.getGenericInterfaces()[0]!!
    if ("$genericSuper" != expected)
        throw AssertionError("Fail, expected: $expected, actual: $genericSuper")
}


val unitFun = { }
val intFun = { 42 }
val stringParamFun = { x: String -> }
val listFun = { l: List<String> -> l }
val mutableListFun = fun (l: MutableList<Double>): MutableList<Int> = null!!
val funWithIn = fun (x: Comparable<String>) {}

val extensionFun = fun Any.() {}
val extensionWithArgFun = fun Long.(x: Any): Date = Date()

