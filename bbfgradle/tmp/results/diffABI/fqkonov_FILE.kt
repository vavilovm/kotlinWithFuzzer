// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
interface A {
    open val foo: String
      get() = "OK"
}

open class B : A {

}

class C : B() {
    inner class D {
        val foo: String = super<B>@C.foo
    }
}

fun box():String = TODO()

internal object Blv  : A, B(){


internal  fun  oocpb(a: HashSet<A>, b: String, c: LinkedHashSet<Double>, d: Sequence<C>): Map<Long?, String> = TODO()

public  fun   Function1<C, UShort>.mwywq(a: Long, b: UShort, c: UShort?): A = TODO()

private val zlxy: C  
get() = C()


val ytoo: Collection<C>  
get() = TODO()


public val rafq: HashMap<ULong, A>  
get() = TODO()




}


