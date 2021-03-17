// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.Int.*
import kotlin.sequences.*
import kotlin.reflect.*

internal interface A {
    fun foo(): String
}

internal class B : A {
    override fun foo():String = TODO()
}

internal val global = B()

internal class C(x: Int) : A by global {
    constructor(a: Double = 1.0): this(1)
}

fun box(): Int =TODO()

internal abstract class Gry  (var vak: Function1<String?, B>, var frc: Int, val iyl: B = B(), s: String?): A{
    var xi = 0
    var xin : Int? = 0
    var xinn : Int? = null

    var xl = 0.toLong()
    var xln : Long? = 0.toLong()
    var xlnn : Long? = null

    var xb = 0.toByte()
    var xbn : Byte? = 0.toByte()
    var xbnn : Byte? = null

    var xf = 0.toFloat()
    var xfn : Float? = 0.toFloat()
    var xfnn : Float? = null

    var xd = 0.toDouble()
    var xdn : Double? = 0.toDouble()
    var xdnn : Double? = null

    var xs = 0.toShort()
    var xsn : Short? = 0.toShort()
    var xsnn : Short? = null
}

private object Eji  : A{

override fun foo(): String = TODO()


inline val Any: Set<UShort>  
get() = emptySet<UShort>()


internal var fcdr: Function1<Char, Int>  
get() = {a: Char -> -1666298589}
set(arg) = TODO()


internal var yevi: Set<B>  
get() = TODO()
set(value) = TODO()




}

data private  class Dep  (val dpk: UByte, val ecu: String, val lpf: HashMap<() -> Int, String>){}

private inline  final class Bgq  (val value: String ){


fun <T: UByte, S>  fqyiu(a: LinkedHashMap<Function1<Any, C>, String>?, b: C, c: String, d: T): Gry = TODO()

internal val xdhq: Double?  
get() = TODO()


public var Int: String  
get() = TODO()
set(value) = TODO()




}

// SKIP_JDK6
// TARGET_BACKEND: JVM
// WITH_RUNTIME
// FULL_JDK
// KOTLIN_CONFIGURATION_FLAGS: +JVM.PARAMETERS_METADATA
interface Test {
    fun test(OK: String):String = TODO()
}




internal suspend fun <T: RuntimeException, S>  qdawb(a: T, b: Byte, c: T, d: HashSet<*>): Array<out Any?>? = TODO()

private fun  uxzjp(): String = TODO()

private  class Tuh <T: String>  (qri: ULong, val jlc: String){


private  fun  jrpdj(a: ULong, y: Int, c: String): LinkedHashMap<String, *> = TODO()

private inline   final fun  drpsl(a: Bgq, b: String): ArrayDeque<String> = TODO()

val testDelegated: String
        get() = "fail"




}

internal inline  final class Ozv <T: DoubleIterator, S: String>  (val xyz: Char){


infix protected  fun <TODO, S: KProperty0<Unit>>   Map<String?, String>.vidfj(a: Boolean): Gry = TODO()

public var absa: Set<Array<T>?>  
get() = TODO()
set(value) = TODO()




}


