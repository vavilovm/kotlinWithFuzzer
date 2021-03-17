// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.UninitializedPropertyAccessException


fun zero() = 0

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 7 downTo 1 step zero()) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 7L downTo 1L step zero().toLong()) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 'g' downTo 'a' step zero()) {
        }
    }

    return "OK"
}

fun box761(): String {
    lateinit var prope0: String
    var prope1: String = (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).cause.toString()
    try{
println("""TRY""");

        prope1 = (assertFailsWith<IllegalArgumentException> {
        for (i in 7L downTo 7L step zero().toLong()) {
        }
    }).toString()
        return (assertFailsWith<IllegalArgumentException> {
        for (i in 'g' downTo 'a' step zero()) {
        }
    }).toString()
}
    catch (e: UninitializedPropertyAccessException){
println("""CATCH e: UninitializedPropertyAccessException""");

        return ('a' downTo 'g').toString()
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        return "Unexpected exception: ${assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 0 step zero()) {
        }
    }::class}"
}
}

fun box882(): String {
    lateinit var prope0: String
var prope1: String = (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).cause.toString()
var prope2 = (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 1 step zero()) {
        }
    }::class).equals("gdzjn").toString();
    var prope3 = fu0(b = ((assertFailsWith<IllegalArgumentException> {
        for (i in zero().toLong() downTo 1L step zero().toLong()) {
        }
    })).message.plus("pqpqf"), a = { "ulmwd"}(), c = { "bppet"})
    if (((assertFailsWith<IllegalArgumentException> {
        for (i in 'g' downTo 'g' step zero()) {
        }
    })).message.equals("xhwjt", (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).equals("ddepc") || (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 1 step zero()) {
        }
    }).message.equals("gwkfy", (7 downTo 1).toString().equals("dugxu")))) {
println("""THEN""");
return (assertFailsWith<IllegalArgumentException> {
        for (i in 7 downTo 1 step zero()) {
        }
    }).stackTraceToString()
}

    prope1 = prope1;
    prope3 = fu0(b = (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).toString(), c = { "trgfn"}, a = { "rvyly"}())
    if ((assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).equals("ddepc") || (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 1 step zero()) {
        }
    }).message.equals("gwkfy", (7 downTo 1).toString().equals("dugxu"))) {
println("""THEN""");
return "fail 2: $prope2 != KOL or $prope3 != OKL"
}


    prope2 = "";
    prope3 = fu0(c = {prope2 += (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).hashCode().toString(-zero()); "L"}, b = (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 0 step zero()) {
        }
    }).cause.toString(), a = (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo 1 step zero()) {
        }
    }).message.plus("kvobe"))
    if ((1L downTo 7L).none() || (zero() downTo 0).toString().equals("dugxu")) {
println("""THEN""");
return "fail 3: $('a' downTo 'a').toString() != KOL or $prope3 != OKL"
}

    return "OK"

}

fun fu0(a: String, b: String, c: () -> String): String {
    lateinit var prope0: String
var prope1: String = (assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    }).cause.toString()
return ((assertFailsWith<IllegalArgumentException> {
        for (i in 'a' downTo 'a' step zero()) {
        }
    })).equals("wpxqo").toString() + (assertFailsWith<IllegalArgumentException> {
        for (i in zero() downTo zero() step zero()) {
        }
    }).message.plus("adgjg");
}


