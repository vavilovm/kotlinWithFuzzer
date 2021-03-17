// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all-compatibility
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.collections.*
import kotlin.sequences.*
interface Test<T> {
    var T.test: T
        get() = null!!
        set(value) {
            null!!
        }
}

interface Test2 : Test<String> {
    override var String.test: String
        get() = ""
        set(value) {}
}

class TestClass : Test2

fun box(): String =TODO()

fun checkNoMethod(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()

fun checkMethodExists(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()

private interface Mfr : Map<ArrayDeque<UInt>, MutableMap<UInt, Boolean>>, Function<Boolean>{

override val size:  kotlin.Int
override val values:  kotlin.collections.Collection<kotlin.collections.MutableMap<kotlin.UInt, kotlin.Boolean>>
override fun containsValue(value: kotlin.collections.MutableMap<kotlin.UInt, kotlin.Boolean>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

var UShort.axwd: Sequence<Short> 
get() = TODO()
set(value) = TODO()

var ybro: TestClass 

val txyx: Double 

var wdkp: Test2 

val moun: String 

var Float.epjx: HashSet<String> 
get() = TODO()
set(value) = TODO()

var Map<Pair<ULong, Double>, Collection<Float>>.nalm: ArrayList<Short> 
get() = TODO()
set(value) = TODO()

}


