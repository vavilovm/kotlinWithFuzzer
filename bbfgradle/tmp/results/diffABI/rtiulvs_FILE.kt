// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.lang.reflect.ParameterizedType
import kotlin.reflect.jvm.javaType
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.collections.*
import kotlin.sequences.*


class Bar
fun arrayOfInvBar(): Array<Bar> = TODO()
fun arrayOfInBar(): Array<in Bar> = TODO()
fun arrayOfOutBar(): Array<out Bar> = TODO()

fun arrayOfInvList(): Array<List<String>> = TODO()
fun arrayOfInList(): Array<in List<String>> = TODO()
fun arrayOfOutList(): Array<out List<String>> = TODO()

fun box(): String =TODO()

internal interface Anp : Map<ArrayDeque<Bar>, Sequence<UShort>>, Annotation{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.ArrayDeque<Bar>, kotlin.sequences.Sequence<kotlin.UShort>>>
override val size:  kotlin.Int
override fun containsKey(key: kotlin.collections.ArrayDeque<Bar>): kotlin.Boolean = TODO()

var tgdg: Bar 

var mxim: String 

var ryyn: Bar 

val List<Double>.xmrx: Bar 
get() = TODO()


val vyrh: ArrayDeque<HashSet<Long>> 

var wyvg: ArrayDeque<Bar> 

val avny: Int 

val myjp: Sequence<Bar> 

var mdwx: Char 

}


