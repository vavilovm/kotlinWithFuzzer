// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

package test
import kotlin.collections.*


val A.a: String
  get() {
      class B {
          val b : String
              get() = this@a.s
      }
      return B().b
  }

class A {
    val s : String = "OK"
}

fun box() : String =TODO()

internal interface Zty : Grouping<ArrayDeque<Byte>, HashMap<A, LinkedHashSet<Short>>>, Map<A, A>, MutableSet<UInt>{

override fun sourceIterator(): kotlin.collections.Iterator<kotlin.collections.ArrayDeque<kotlin.Byte>> = TODO()

override val size:  kotlin.Int
override fun add(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<kotlin.UInt> = TODO()

override fun remove(element: kotlin.UInt): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<kotlin.UInt>): kotlin.Boolean = TODO()

public fun <T>  binct(a: List<String>, b: T): Long = TODO()

var kxgv: Float 

var Long.srug: Double 
get() = TODO()
set(value) = TODO()

var A.yodd: A 
get() = TODO()
set(value) = TODO()

val nhoq: Int 

val iszs: ULong 

var A.gifl: ArrayDeque<Int> 
get() = TODO()
set(value) = TODO()

var pmmg: A 

var jzfn: Long 

val bqai: Boolean 

}


