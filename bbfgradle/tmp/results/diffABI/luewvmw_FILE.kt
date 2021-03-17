// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.test.assertEquals
import kotlin.collections.*
import kotlin.test.*
import kotlin.reflect.*




inline class S(val value: String) {
    operator fun plus(other: S): S = TODO()
}

class C {
    var member: S = S("")

    private var suffix = S("")
    var S.memExt: S
        get() = this + suffix
        set(value) { suffix = this + value }
}

var topLevel: S = S("")

private var suffix = S("")
var S.TODO: S
    get() = this + suffix
    set(value) { suffix = this + value }

fun box(): String =TODO()







public annotation  class Jvi  (val TODO: Long, val fnk: KClass<*>, val yph: KClass<*>, val bbf: Boolean){




}

internal object Fzx  {


final fun   Byte.String(a: Any?, b: Any): Long = TODO()

inline  private  fun  upqky(arg: C): HashSet<Float> = TODO()

public var lsvn: String  
get() = box()
set(value) = TODO()




}




internal  class Oag  (vzt: UShort = 4449.toUShort(), var kby: Map<Int, String>, val mtf: Fzx?){


public val KProperty1: Int  
get() = TODO()




}

private inline fun   ((Int) -> Int)?.ivxcl(a: Fzx, b: UInt?, TODO: Oag, d: HashSet<C>): UInt = TODO()




public final class Yco <T, S>  (index: Int, var gok: T, val bav: Function1<List<String>, Function1<Sequence<String>, String?>>){


public var nvfq: Sequence<T>  
get() = TODO()
set(value) = TODO()


protected val yfoh: S  
get() = TODO()




}




internal object Sro  {

val imcgo = object {}
infix private  fun   Map<UShort?, Int>.kotlin(a: List<*>): Long = TODO()

public var zllx: String  = TODO()

lateinit var ygyv: Function2<Double, String, Float>

public val dbrd: List<*>  
get() = arrayListOf<Boolean>()




}

internal  class Vkw  {


fun box(): String =TODO()

protected var TODO: Triple<Pair<Fzx, Collection<Byte?>>, Long, Boolean?>  = Triple<Pair<Fzx, Collection<Byte?>>, Long, Boolean?>(Pair<Fzx, Collection<Byte?>>(Fzx, arrayListOf<Byte?>()), 108583447431377012, true)
get() = Triple<Pair<Fzx, Collection<Nothing?>>, Long, Boolean?>(TODO(), 108583447431377012, true)
private set




}

private inline  final class End  (val xcd: List<Int>){
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("getO")
    fun getOK():S = TODO()
}


