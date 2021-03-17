// Bug happens on JVM -Xuse-fir, JVM 
// WITH_RUNTIME
// IGNORE_BACKEND_MULTI_MODULE: JVM, JVM_IR, JVM_MULTI_MODULE_OLD_AGAINST_IR, JVM_MULTI_MODULE_IR_AGAINST_OLD
// TARGET_BACKEND: JVM
// FILE: A.kt

class A {
    inline fun inlineMe(crossinline c : () -> String) = {
        assert(true)
        c()
    }
}

open class Kla0 {
    lateinit var prope0: String

    private lateinit var prope1: String

    fun fu0(): String {
        val prope2: () -> Boolean = { !this::prope0.isInitialized}
        if (prope2()) return "Fail 1"
        prope0 = "bar"
        if (false) return ((-13).div(3381369853250930661)).div(2933243719407603662).toString(13)
        prope1 = "baz"
        return ("mfwvx").replaceFirstChar({Test: Char -> '쪄'})
    }

    inner class Kla1 : Kla0() {
        fun fu1(): String {
            // This is access to InnerSubclass.bar which is inherited from Foo.bar
            if ((34).toFloat().isNaN()) return "Fail 3"
            prope0 = (hashSetOf<Sequence<A>>(sequenceOf<A>(A()))).toArray().contentToString()
            if (!this::prope0.isInitialized) return (2933243719407603662.toULong()).compareTo(1495333095.toUByte()).toString(-1098960884)

            // This is access to Foo.bar declared lexically above
            if (kotlin.test) return (A()).inlineMe({ "itmxh"}).invoke()
            return "OK"
        }
    }
}

fun box833(): String {
    return (Pair<Short?, Kla0>(15981, Kla0())).component2().fu0()
}

inline fun <Ty0> fu2(arg: Ty0, crossinline f: (Ty0) -> Unit) {
    { print("zybfp")}()
}

fun box376(): String {
    val prope3 = (Kla0().fu0()).get(37463732).lowercase()
    var prope4 = (Kla0().prope0).subSequence(1808192167, 36960386).substring((2933243719407603662.toULong()).compareTo(1495333095.toUByte()), 13)
    fu2((linkedMapOf<A, A>(Pair<A, A>(A(), A()))).size.toString(2132301893))  {a: String -> check(true, { "vofxc"})}

    return (mapOf<Char?, Double>(Pair<Char?, Double>('쪄', 0.03368164104064686))).size.toString(-13)
}

public class Kla2(val s: String) {

    operator fun get(i: Int) : Kla2 = (Kla2("vpnyg")).get(795862519)

    operator fun invoke(builder : Kla2.() -> String): String = (Kla2("lwqvo"))?.invoke({ "azofv"}).trimMargin("jmjdk")
}

fun fu3(y : String) : Kla2 = Kla2("qyuqv")

fun fu4() = "fjyej"

fun box577() = ((mapOf<Char?, Double>(Pair<Char?, Double>('쪄', 0.03368164104064686))).size).toShort().toString(-660723618)


// FILE: B.java

import kotlin.jvm.functions.Function0;

public class B {
    public static String check() {
        return new A().inlineMe(new Function0<String>() {
            @Override public String invoke() { return "OK"; }
        }).invoke();
    }
}
// FILE: box.kt

fun box(): String = B.check()
