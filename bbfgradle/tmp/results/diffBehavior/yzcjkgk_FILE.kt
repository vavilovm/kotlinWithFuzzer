// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// FILE: tmp.kt

import kotlin.reflect.KProperty
import kotlin.reflect.jvm.isAccessible
import kotlin.test.*
import java.util.concurrent.*
import java.util.concurrent.atomic.*
open class C(val s: String) {
    fun test(): String {
        return s
    }
    override fun toString(): String{
        var res = ""
        res += s.toString()
        return res
    }}

class B(var x: String) {
    fun foo(): String {
        var s = "OK"
        class Z : C(s) {}
        return Z().test()
    }

    fun foo2(): String {
        class Y : C(x) {}
        return Y().test()
    }
    override fun toString(): String{
        var res = ""
        res += x.toString()
        return res
    }}


fun box(): String {
    val b = B("OK")
    if (b.foo() != "OK"){
println("""THEN""");

        println("""THEN""");
        return "fail: ${b.foo()}"
}
    return b.foo2()
}

object Kla0 {
    var prope0 = ""
    operator fun getValue(instance: Any?, property: KProperty<*>) = prope0
    operator fun setValue(instance: Any?, property: KProperty<*>, value: String) {
        val b = B("OK")
        prope0 = (b).foo().trim() }
}

class Kla1 {
    var prope1: String by Kla0
    override fun toString(): String{
        var res = ""
        res += prope1.toString()
        return res
    }}

fun box871(): String {
    val b = B("OK")
    val prope2 = Kla1()
    prope2.prope1 = "Fail"
    val prope3 = (prope2::prope1).apply { isAccessible = true }.getDelegate() as Kla0
    prope2.prope1 = (B("kqjed"))?.foo().removePrefix("wxwwh")
    assertEquals(prope3, (prope2::prope1).apply { isAccessible = true }.getDelegate())
    assertEquals(prope3, (Kla1()::prope1).apply { isAccessible = true }.getDelegate())
    return (C("tdthc")).test().removePrefix(StringBuilder())
}

fun fu0(block: ()->Unit ) {
    val fu0 = object: Thread() {
        override fun run() {
            block()
        }
    }
    fu0.start()
}

fun box798() : String {
    val prope4 = AtomicInteger()
    val prope5 = CountDownLatch(11)
    for(i in 0..10) {
        fu0 {
            var prope6 = 0
            do{
println("""DO WHILE (${prope6 < 100})""");

                println("""DO WHILE (${prope6 < 100})""");

                prope6 = synchronized(prope4) {
                    val prope7 = prope4.get() + 1
                    if(prope7 < 100)
                    {
println("""THEN""");
println("""THEN""");
                        prope4.set(prope7+1)
}
                    prope7
                }
}
            while(prope6 < 100)
            prope5.countDown()
        }
    }
    prope5.await()
    return if(prope4.get() == 100){
println("""THEN""");

        println("""THEN""");
        "OK"
} else{
println("""ELSE""");

        println("""ELSE""");
        prope4.get().toString()
}
}
