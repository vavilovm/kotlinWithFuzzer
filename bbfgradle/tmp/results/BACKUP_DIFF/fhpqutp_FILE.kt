// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

enum class A {
    X {
        val x = "OK"

        inner class Inner {
            fun foo() = x
        }

        val z = Inner()

        override val test = z.foo()
    };

    abstract val test: String
}

fun box() = A.X.test

fun f0(): Int {
   val prop0 = "test"
   val prop1 = "test"
   return prop0.compareTo(prop1)
}

fun box341(): String = if(f0() == 0) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"Fail"
}

data class Kl0(val par0: Char){
override fun toString(): String{
var res = ""
res += par0.toString()
return res
}
}

fun box655() : String {
   val prop2 = Kl0('a').hashCode()
   val prop3 = ('a' as Char?)!!.hashCode()
   return if( prop2 == prop3 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$prop2 $prop3"
}
}

class Kl1 {
    operator fun component1() = 1
    operator fun component2() = 2
}

fun box639() : String {
    val (smth0, smth1) = Kl1()

    fun f3(): Int {
        return smth0
    }
    return if (f3() == 1 && smth1 == 2) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}


