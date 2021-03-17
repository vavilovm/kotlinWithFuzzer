// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test


import kotlin.reflect.KClass
import kotlin.reflect.*
import kotlin.properties.*
import kotlin.ranges.*
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.test.*
import kotlin.jvm.*
import kotlin.experimental.*
import kotlin.annotation.*
import kotlin.contracts.*



@Repeatable()
@DslMarker()
annotation class Anno(val k1: KClass<*>, val k2: KClass<*>, val k3: KClass<*>)

@AfterTest()
fun box(): String =TODO()

internal interface Grq : ReadWriteProperty<Anno, Int>, ClosedRange<Double>{

override fun getValue(thisRef: test.Anno, property: kotlin.reflect.KProperty<*>): kotlin.Int = TODO()

override val endInclusive:  kotlin.Double
fun   UShort.mjnel(a: Map<UShort, Collection<Char>>, b: ArrayList<HashSet<Boolean>>, c: Anno, d: Byte): Long = TODO()

val nrjd: Anno 

var dagq: Triple<Anno, HashMap<Anno, Anno>, Boolean> 

var pwvs: Collection<Map<Anno, UShort>> 

val ujdr: String 

val hxrf: Anno 

val hqgu: Boolean 

val uijk: ULong 

public abstract fun  provideDelegate(thisRef: kotlin.Pair<kotlin.Long, kotlin.Float>, property: kotlin.reflect.KProperty<*>): test.Anno

public abstract override fun  isEmpty(): kotlin.Boolean

}













private interface Irs <T, S> : Grq, PropertyDelegateProvider<Pair<Long, Float>, Anno>{

override fun getValue(thisRef: test.Anno, property: kotlin.reflect.KProperty<*>): kotlin.Int = TODO()

override var dagq:  kotlin.Triple<test.Anno, kotlin.collections.HashMap<test.Anno, test.Anno>, kotlin.Boolean>
override fun setValue(thisRef: test.Anno, property: kotlin.reflect.KProperty<*>, value: kotlin.Int): kotlin.Unit = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun provideDelegate(thisRef: kotlin.Pair<kotlin.Long, kotlin.Float>, property: kotlin.reflect.KProperty<*>): test.Anno = TODO()

var Float.fcnh: Anno 
get() = TODO()
set(@Anno(Irs::class, Array::class, Map::class)
value) = TODO()

@Deprecated("muthi", ReplaceWith("fiqvx", "xqoha"), kotlin.DeprecationLevel.HIDDEN)
val Anno.ggfy: UShort 
get() = TODO()


@Deprecated("yubpl", ReplaceWith("kdnsd", "pbygz"), kotlin.DeprecationLevel.HIDDEN)
val obwi: S 

val htkm: HashMap<T, Double> 

var zzxz: Short 

}




public interface Ofn : Annotation, @Anno(Ofn::class, @ExperimentalUnsignedTypes()
Ofn::class, List::class)
MutableSet<@Anno(@Anno(Grq::class, ArrayDeque::class, Anno::class)
Int::class, Char::class, HashSet::class)
Anno>, AsserterContributor{

override val size:  kotlin.Int
override fun isEmpty(): kotlin.Boolean = TODO()

override fun remove(element: test.Anno): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<test.Anno>): kotlin.Boolean = TODO()

var Array<String>.sozs: Anno 
get() = TODO()
set(value) = TODO()

var evxl: List<Anno> 

val cxqf: Int 

val ndla: @ExtensionFunctionType()
Int 

var Anno.cooh: Double 
get() = TODO()
set(value) = TODO()

@Anno(Anno::class, LinkedHashMap::class, Anno::class)
val yamm: Pair<Anno, Anno> 

val unvc: Anno 

var gxta: Set<Array<UByte>> 

}








