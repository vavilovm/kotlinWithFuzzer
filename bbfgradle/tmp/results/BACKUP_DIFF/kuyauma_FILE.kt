// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import java.util.AbstractList
interface IFoo {
    fun foo(): String
}

interface IBar {
    fun bar(): String
}

enum class Test : IFoo, IBar {
    FOO {
        // FOO referenced from inner class constructor with initialized 'this'
        inner class Inner {
            val fooFoo = FOO.foo()
        override fun toString(): String{
var res = ""
res += fooFoo.toString()
return res
}}

        val z = Inner()

        override fun foo() = "OK"

        override fun bar() = z.fooFoo
    }
}

fun box() = Test.FOO.bar()

@Kl1(i) class Kl0

fun box608(): String {
    val prop2 = Kl0::class.java.getAnnotation(Kl1::class.java)
    if (prop2 == null) {
println("""THEN""");
return "fail: cannot find Ann on MyClass}"
}
    if (prop2.i != 1) {
println("""THEN""");
return "fail: annotation parameter i should be 1, but was ${prop2.i}"
}
    return "OK"
}

@Retention(AnnotationRetention.RUNTIME)
annotation class Kl1(val i: Int)

const val prop0: Int = 1

const val i: Int = prop0

fun box746(): String {
    var prop3 = 0u
    for (i: UInt? in 1u..3u) {
        prop3 = f0(prop3, i)
    }
    return if (prop3 == 6u) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $prop3"
}
}

fun f0(i: UInt, par1: UInt?): UInt {
    return i + par1!!
}

class Kl2(): AbstractList<String>() {
     public fun f1(): Int = modCount
     public override fun get(index: Int): String = ""
     public override val size: Int get() = 0
override fun toString(): String{
var res = ""
res += size.toString()
return res
}}

fun box917(): String {
    return if (Kl2().f1() == 0) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}


