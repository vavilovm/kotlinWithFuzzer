// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.jvm.reflect

class C {
    val o = { O: String -> }
    val k = { K: String -> }

    constructor(y: Int)
    constructor(y: String)
}

fun box(): String =
    (C(0).o.reflect()?.parameters?.singleOrNull()?.name ?: "null") +
            (C("").k.reflect()?.parameters?.singleOrNull()?.name ?: "null")
