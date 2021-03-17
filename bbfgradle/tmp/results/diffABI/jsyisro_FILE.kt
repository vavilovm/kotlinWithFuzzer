// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

        // IGNORE_BACKEND_FIR: JVM_IR

// SKIP_JDK6
inline fun <reified T : String> X(): (T)? = TODO()
//KT-3869 Loops and finally: outer finally block not run
// FULL_JDK
// TARGET_BACKEND: JVM
class A : MutableMap<Any, Any> {
    override val entries: MutableSet<MutableMap.MutableEntry<Any, Any>>
        get() = TODO()
    override val keys: MutableSet<Any>
        get() = throw UnsupportedOperationException()
    override val values: MutableCollection<Any>
        get() = throw UnsupportedOperationException()

    override fun clear():Unit =TODO()

    override fun put(key: Any, value: Any): Any? =TODO()

    override fun putAll(create: Map<out Any, Any>):Unit =TODO()

    override fun remove(key: Any): Any? =TODO()

    override val size: Int
        get() = throw TODO()

    override fun containsKey(key: Any): Boolean =TODO()

    override fun containsValue(value: Any): Boolean =TODO()

    tailrec override infix operator fun get(key: Any): String =TODO()

    override fun isEmpty(): Boolean =TODO()

    fun box(): String =TODO()
}

fun box():Int = TODO()

