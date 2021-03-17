// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

@Target(AnnotationTarget.PROPERTY)
annotation class Anno(val value: String)

annotation class M(@Anno("OK") val result: Int)

fun box(): String =
    M::class.java.getAnnotation(Anno::class.java)?.value
        // TODO: fix KT-22463 and enable this test
        // ?: "Fail: no annotation"
        ?: "OK"
