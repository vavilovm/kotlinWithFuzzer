// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      JavaPrimitiveType0Kt.check(Boolean.TYPE, "boolean");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Boolean.TYPE), "boolean");
      JavaPrimitiveType0Kt.check(Character.TYPE, "char");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Character.TYPE), "char");
      JavaPrimitiveType0Kt.check(Byte.TYPE, "byte");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Byte.TYPE), "byte");
      JavaPrimitiveType0Kt.check(Short.TYPE, "short");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Short.TYPE), "short");
      JavaPrimitiveType0Kt.check(Integer.TYPE, "int");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Integer.TYPE), "int");
      JavaPrimitiveType0Kt.check(Float.TYPE, "float");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Float.TYPE), "float");
      JavaPrimitiveType0Kt.check(Long.TYPE, "long");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Long.TYPE), "long");
      JavaPrimitiveType0Kt.check(Double.TYPE, "double");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Double.TYPE), "double");
      JavaPrimitiveType0Kt.check(Void.TYPE, "void");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Void.class), "void");
      JavaPrimitiveType0Kt.checkNull((Class)null);
      JavaPrimitiveType0Kt.checkNull(Reflection.getOrCreateKotlinClass(String.class));
      JavaPrimitiveType0Kt.check(Void.TYPE, "void");
      JavaPrimitiveType0Kt.check(Reflection.getOrCreateKotlinClass(Void.class), "void");
      return "OK";
   }
}

// FILE: javaPrimitiveType0.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

import kotlin.reflect.KClass

fun check(clazz: Class<*>?, expected: String) {
    assert (clazz!!.canonicalName == expected) {
        "clazz name: ${clazz.canonicalName}"
    }
}

fun check(kClass: KClass<*>, expected: String) {
    check(kClass.javaPrimitiveType, expected)
}

fun checkNull(clazz: Class<*>?) {
    assert (clazz == null) {
        "clazz should be null: ${clazz!!.canonicalName}"
    }
}

fun checkNull(kClass: KClass<*>) {
    checkNull(kClass.javaPrimitiveType)
}

