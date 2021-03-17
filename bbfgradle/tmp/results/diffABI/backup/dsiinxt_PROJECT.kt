// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: 1.kt

import a.OK

fun box(): String {
    val okRef = ::OK

    val annotations = okRef.annotations
    if (annotations.size != 1) {
        return "Failed, annotations: $annotations"
    }

    return okRef.get()
}
// FILE: 2.kt

@file:[JvmName("MultifileClass") JvmMultifileClass]
package a

annotation class A

@A
const val OK: String = "OK"
