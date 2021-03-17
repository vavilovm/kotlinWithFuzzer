// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package a


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT
// FULL_JDK

import java.lang.reflect.TypeVariable
import kotlin.reflect.jvm.*
import kotlin.test.assertEquals

class A<T> {
    fun foo(t: T) {}
}

fun box0(): String {
    val f = A<String>::foo
    val t = f.parameters.last().type.javaType
    if (t !is TypeVariable<*>) return "Fail, t should be a type variable: $t"

    assertEquals("T", t.name)
    assertEquals(A::class.java, (t.genericDeclaration as Class<*>))

    return "OK"
}

//File: tmp/tmp1.kt
package a.b


@Suppress("UNRESOLVED_REFERENCE")
class A {
    val a: ABC = null
}
//File: tmp/tmp2.kt
package c


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(
        val b: Byte,
        val s: Short,
        val i: Int,
        val f: Float,
        val d: Double,
        val l: Long,
        val c: Char,
        val bool: Boolean
)

fun box2(): String {
    val ann = MyClass::class.java.getAnnotation(Ann::class.java)
    if (ann == null) return "fail: cannot find Ann on MyClass}"
    if (ann.b != 1.toByte()) return "fail: annotation parameter b should be 1, but was ${ann.b}"
    if (ann.s != 1.toShort()) return "fail: annotation parameter s should be 1, but was ${ann.s}"
    if (ann.i != 1) return "fail: annotation parameter i should be 1, but was ${ann.i}"
    if (ann.f != 1.toFloat()) return "fail: annotation parameter f should be 1, but was ${ann.f}"
    if (ann.d != 1.0) return "fail: annotation parameter d should be 1, but was ${ann.d}"
    if (ann.l != 1.toLong()) return "fail: annotation parameter l should be 1, but was ${ann.l}"
    if (ann.c != 'c') return "fail: annotation parameter c should be 1, but was ${ann.c}"
    if (!ann.bool) return "fail: annotation parameter bool should be 1, but was ${ann.bool}"
    return "OK"
}

@Ann(1, 1, 1, 1.0.toFloat(), 1.0, 1, 'c', true) class MyClass
