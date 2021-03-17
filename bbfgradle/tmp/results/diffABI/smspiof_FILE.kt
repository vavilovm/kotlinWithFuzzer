// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.collections.*
import kotlin.reflect.*


annotation class NoParams
annotation class OneDefault(val s: String = "OK")
annotation class OneNonDefault(val s: String)
annotation class TwoParamsOneDefault(val s: String, val x: Int = 42)
annotation class TwoParamsOneDefaultKClass(val string: String, val klass: KClass<*> = Number::class)
annotation class TwoNonDefaults(val string: String, val klass: KClass<*>)


inline fun <reified T : Annotation> create(args: Map<String, Any?>): T =TODO()

inline fun <reified T : Annotation> create(): T = TODO()

fun box(): String =TODO()

public object Vml {


val gvxp: Long  
get() = 2972490571874432140






}







private interface Acj <in T, out S> {


inline  private fun  mbnht(a: Map<Byte, ULong>?, b: Array<Collection<UInt>>, c: Short): S = TODO()

fun  dshyv(a: OneNonDefault, b: TwoParamsOneDefaultKClass, c: NoParams?): TwoNonDefaults?

private fun  oakem(a: Float, b: TwoParamsOneDefaultKClass, c: NoParams?, d: TwoParamsOneDefault): T = TODO()

var opcf: HashMap<Double, OneNonDefault>?  



val TwoParamsOneDefault.epaq: TwoParamsOneDefault  
get() = TODO()


val renx: Char  







}


