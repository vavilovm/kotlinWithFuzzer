// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


package cnawfzj
import kotlin.test.assertEquals
import kotlin.reflect.*
import kotlin.test.*
import kotlin.collections.*
import kotlin.sequences.*


interface IFoo {
    fun foo(s: String): String
}

inline class Z(val x: Long) : IFoo {
    override fun foo(s: String): String = TODO()
}

class Test(x: Long) : IFoo by Z(x)

fun box(): String =TODO()




private interface Mqx <T: Boolean, S> : KClass<String>, MutableMap<Z, Z>{

override val size:  kotlin.Int
override fun clear(): kotlin.Unit = TODO()

override fun containsKey(key: Z): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun put(key: Z, value: Z): Z? = TODO()

override fun putAll(from: kotlin.collections.Map<out Z, Z>): kotlin.Unit = TODO()

override fun remove(key: Z): Z? = TODO()

var Sequence<Double>.dltz: Array<IFoo> 
get() = TODO()
set(value) = TODO()

val IFoo.uraf: Map<IFoo, Char> 
get() = TODO()


var syac: Char 

val regf: S 

var kimu: Z 

var muii: ULong 

}
