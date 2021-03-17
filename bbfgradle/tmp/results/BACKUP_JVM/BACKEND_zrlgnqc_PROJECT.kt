// Bug happens on JVM 
//File: tmp/tmp0.kt
package a


import a.c.Foo
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

inline class Foo(val z: String)

var f = Foo("zzz")

fun box2(): (String)? {
    val f = Foo(23, {x -> 
val n = false
if (n) {2 * x} else {2 * x}
})
    
val a = false
if (a) {return if (f.next()!! == 46) "OK" else "fail"} else {return if (f.next()!! == 46) "OK" else "fail"}

}
//File: tmp/tmp1.kt
package a.c


import a.b.C.Companion
import a.b.C
import a.b.Obj
class Foo(
        var state : Int,
        val f : (Int) -> Int){

    fun next() : Int {
        val nextState = f(state)
        state = nextState
        return state
    }
}

fun box1(): String {
    (Obj::class.members.single { it.name == "foo" }).call(Obj)
    (C.Companion::class.members.single { it.name == "bar" }).call(C.Companion)
    return "OK"
}

//File: tmp/tmp2.kt
package a.b


import a.f
import a.Foo
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

object Obj {
    @JvmStatic
    fun foo() {}
}

class C {
    companion object {
        @JvmStatic
        fun bar() {}
    }
}

fun box0(): String {
    (::f)!!.set(Foo("OK"))
    return (::f).get().z
}
