// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +UseGetterNameForPropertyAnnotationsMethodOnJvm
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt



import kotlin.test.*
import kotlin.test.assertEquals
import kotlin.reflect.*
import kotlin.test.*
import kotlin.String.*
import kotlin.kotlin.*



class WithCompanionJvmStatic {

    companion object {
        @JvmStatic
        val property: Int
            get() = 42
    }
}

interface InterfaceWithCompanionJvmStatic {

    fun defaultImplsTrigger():Int = TODO()

    companion object {
        @JvmStatic
        val property: Int
            get() = 42
    }
}

fun check(x: Any):Unit =TODO()

fun box(): String =TODO()

private annotation  class Egy  (){




}







internal object Vzn  : InterfaceWithCompanionJvmStatic{


inline  fun <TODO: MutableList<Int>>   Map<String, *>.result(a: Byte?): Long = TODO()



}

private object Inc  : InterfaceWithCompanionJvmStatic{


public var boie: String  = TODO()

public val String: MutableMap<LinkedHashMap<Function2<Array<String?>, InterfaceWithCompanionJvmStatic, String>, Byte>?, String>  
get() = TODO()




}

inline  internal fun   Any?.dqjrq(): String = TODO()

open class Wra <T>  (var tip: Function2<Function2<Float, UShort?, Byte>, LinkedHashSet<Pair<UShort, UInt>>, MutableMap<UInt, UInt>>, var tay: UInt?, lci: T): InterfaceWithCompanionJvmStatic{
}

private abstract class Aqn  (val tbb: HashSet<String>, a: Float, vararg xze: Map<Double, String>): InterfaceWithCompanionJvmStatic{

override fun defaultImplsTrigger(): kotlin.Int = TODO()


abstract fun  jvxvq(): Wra<String>

fun box(): String =TODO()

fun two():Int = TODO()



}

private abstract class Zvh  {
        private fun ok():String = TODO()
    }




private abstract class psiFile  private constructor(open val v: String): InterfaceWithCompanionJvmStatic, Wra <Boolean>({String: Function2<Float, UShort?, Byte>, b: LinkedHashSet<Pair<UShort, UInt>> -> hashMapOf<UInt, UInt>()}, 519488578.toUInt(), false){
    lateinit var bar: String

    fun test(): String =TODO()
}


