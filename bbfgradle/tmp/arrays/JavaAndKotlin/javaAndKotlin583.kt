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

// FILE: incorrectNumberOfArguments.kt

// !LANGUAGE: +FunctionReferenceWithDefaultValueAsOtherType
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.KCallable
import kotlin.reflect.KFunction
import kotlin.reflect.KMutableProperty

var foo: String = ""

class A(private var bar: String = "") {
    fun getBar() = A::bar
}

object O {
    @JvmStatic
    private var baz: String = ""

    @JvmStatic
    fun getBaz() = (O::class.members.single { it.name == "baz" } as KMutableProperty<*>).apply { isAccessible = true }

    fun getGetBaz() = O::class.members.single { it.name == "getBaz" } as KFunction<*>
}

fun check(callable: KCallable<*>, vararg args: Any?) {
    val expected = callable.parameters.size
    val actual = args.size

    if (expected == actual) {
        throw AssertionError("Bad test case: expected and actual number of arguments should differ (was $expected vs $actual)")
    }

    val expectedExceptionMessage = "Callable expects $expected arguments, but $actual were provided."

    try {
        callable.call(*args)
        throw AssertionError("Fail: an IllegalArgumentException should have been thrown")
    } catch (e: IllegalArgumentException) {
        if (e.message != expectedExceptionMessage) {
            // This most probably means that we don't check number of passed arguments in reflection
            // and the default check from Java reflection yields an IllegalArgumentException, but with a not that helpful message
            throw AssertionError("Fail: an exception with an unrecognized message was thrown: \"${e.message}\"" +
                                 "\nExpected message was: $expectedExceptionMessage")
        }
    }
}

