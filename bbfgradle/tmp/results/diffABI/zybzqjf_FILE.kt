// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
import kotlin.test.*
import kotlin.reflect.*
import kotlin.jvm.*
enum class X {
    B {
        val value2 = "K"

        val value3: String
        init {
            fun foo():String = TODO()
            value3 = "O" + foo()
        }

        override val value = value3
    };

    abstract val value: String
}

fun box():String = TODO()













annotation public  class Shz (val xoq: X, val ylh: ExtensionFunctionType, val bxb: JvmSuppressWildcards, val qio: Byte)




public  class Yne <T, S: ULong> (var bmo: Double = 0.4429561758119569, vararg log: HashSet<UShort>){

public fun  xthly(a: Set<String>, b: UByte): T = TODO()

var Pair<X, Char>.bsba: ArrayList<Long> 
get() =  TODO()
set(value) = TODO()

val Array<X>.sqrd: LinkedHashMap<MutableMap<X, Byte>, S> 
get() =  TODO()


val Short.pcxr: X 
get() =  X.B


val mbyw: X = TODO()

var Byte.kmil: ArrayDeque<S> 
get() =  TODO()
set(value) = TODO()

var fnyd: Pair<UShort, UInt> = TODO()

var rhim: X = X.B

val LinkedHashSet<X>.beop: S 
get() =  TODO()


val ujup: X = X.B
internal open class Fjv {

var X.ixpr: UInt 
get() =  1062541226.toUInt()
set(value) = TODO()

val vtbx: Int = TODO()

val Char.bnyd: Double 
get() =  0.49194084378746716


val ihlq: X = X.B

var jctp: X = X.B

var vcpl: X = X.B

}
}


