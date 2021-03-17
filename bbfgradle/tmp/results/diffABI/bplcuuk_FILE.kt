// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference,, +FunctionReferenceWithDefaultValueAsOtherType
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.reflect.*


class C

internal interface Wvz {

    fun   lol(): UInt = TODO()
}




open class Yxg : Wvz{}



internal abstract class Lhm : Wvz, Yxg(){}
