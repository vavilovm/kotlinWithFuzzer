// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


package zjmbpfi
import kotlin.annotation.*
import kotlin.reflect.*
import kotlin.collections.*
import kotlin.sequences.*
@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(
        val p1: Byte,
        val p2: Short,
        val p3: Int,
        val p4: Long,
        val p5: Double,
        val p6: Float
)

val prop1: Byte = 1 * 1
val prop2: Short = 1 * 1
val prop3: Int = 1 * 1
val prop4: Long = 1 * 1
val prop5: Double = 1.0 * 1.0
val prop6: Float = 1.0.toFloat() * 1.0.toFloat()

@Ann(1 * 1, 1 * 1, 1 * 1, 1 * 1, 1.0 * 1.0, 1.0.toFloat() * 1.0.toFloat()) class MyClass

fun box(): String =TODO()

private interface Ayl <T: Byte, S: UShort> : CharSequence, KClass<MyClass>, KFunction<Set<MyClass>>{

override val length:  kotlin.Int
override val qualifiedName:  kotlin.String?
fun  lycgt(a: HashSet<Ann>, b: String, c: Sequence<MyClass>, d: Ann): UShort = TODO()

val exuz: UInt 

var kjjw: HashSet<UInt> 

var String.xdnc: Byte 
get() = TODO()
set(value) = TODO()

var hnqi: Collection<Char> 

val MyClass.euti: S 
get() = TODO()


val Short.fqbb: String 
get() = TODO()


val aeja: Ann 

}
