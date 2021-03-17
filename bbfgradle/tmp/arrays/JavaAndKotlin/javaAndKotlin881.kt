// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: collectionLiteralsInArgumentPosition.kt

// IGNORE_BACKEND_FIR: JVM_IR
// WITH_REFLECT

// TARGET_BACKEND: JVM

import java.util.Arrays
import kotlin.reflect.KClass
import kotlin.reflect.KFunction0

inline fun <reified T> test(kFunction: KFunction0<Unit>, test: T.() -> Unit) {
    val annotation = kFunction.annotations.single() as T
    annotation.test()
}

fun check(b: Boolean, message: String) {
    if (!b) throw RuntimeException(message)
}

annotation class Foo(val a: FloatArray = [], val b: Array<String> = [], val c: Array<KClass<*>> = [])

@Foo(a = [1f, 2f, 1 / 0f])
fun test1() {}

@Foo(b = ["Hello", ", ", "Kot" + "lin"])
fun test2() {}

@Foo(c = [Int::class, Array<Short>::class, Foo::class])
fun test3() {}

