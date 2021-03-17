// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField
// FILE: tmp0.kt


import kotlin.collections.AbstractMap
class Outer {
    private companion object {
        fun xo():String = TODO()
        fun xk():String = TODO()
    }

    class Nested1 {
        fun foo():String = TODO()
    }

    class Nested2 {
        fun bar():String = TODO()
    }

    fun test():String = TODO()
}

fun box():String = TODO()

internal open class A(val jo: UInt, val xc: Outer): AbstractMap <UInt, ULong>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.UInt, kotlin.ULong>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.UInt>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.ULong>
    get() = TODO()

override fun containsKey(key: kotlin.UInt): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.ULong): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

val tngsz: Outer = TODO()

}


