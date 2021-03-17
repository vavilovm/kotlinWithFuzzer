// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField
// FILE: tmp0.kt


import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.Executors
import java.util.concurrent.Callable
import java.util.concurrent.Future
sealed class Result {
    class Failure(val exception: Exception) : Result(){
override fun toString(): String{
var res = ""
res += exception.toString()
return res
}
}
    class Success(val message: String) : Result(){
override fun toString(): String{
var res = ""
res += message.toString()
return res
}
}
}

fun box() = AnnotationTarget.TYPE

val prope0: Int = 10;

var prope1: Int = 0;

val prope2 = CountDownLatch(prope0)

val prope3 = CountDownLatch(1);

val prope4: Any = Object()

val prope5 = arrayListOf<Int>()

val prope6 = Executors.newFixedThreadPool(prope0)

class Kla0(message: String): Exception(message)

enum class Kla1 {
    Kla3,
    Kla4,
    Kla5,
    Kla6,
    Kla7,
    Kla8,
    Kla9
}

class Kla2(val name: String, val executionType: Kla1) : Callable<String> {

    override fun call(): String {
        prope3.await()
        return when (executionType) {
            Kla1.Kla3 -> {
println("""WHEN Kla1.Kla3""");
fu3()
}
            Kla1.Kla4 -> {
println("""WHEN Kla1.Kla4""");
fu4()
}
            Kla1.Kla5 -> {
println("""WHEN Kla1.Kla5""");
fu5()
}
            Kla1.Kla6 -> {
println("""WHEN Kla1.Kla6""");
fu6()
}
            Kla1.Kla7 -> {
println("""WHEN Kla1.Kla7""");
fu7()
}
            Kla1.Kla8 -> {
println("""WHEN Kla1.Kla8""");
fu8()
}
            Kla1.Kla9 -> {
println("""WHEN Kla1.Kla9""");
fu9()
}
            else -> {
println("""WHEN """);
"fail"
}
        }
    }

    private fun fu2() {
        prope5.add(++prope1);
        prope2.countDown()
    }

    fun fu3(): String {
        synchronized(prope4) {
            fu2()
        }
        return executionType.toString()
    }


    fun fu4(): String {
        synchronized(prope4) {
            fu2()
            return executionType.name
        }
        return "fail"
    }

    fun fu5(): String {
        synchronized(prope4) {
            try{
println("""TRY""");

                fu2()
                throw Kla0(executionType.name)
} catch (e: Kla0){
println("""CATCH e: Kla0""");

                return e.message!!
}
        }
        return "fail"
    }

    fun fu6(): String {
        synchronized(prope4) {
            try{
println("""TRY""");

                fu2()
                return "fail"
} finally{
println("""FINALLY""");

                return executionType.name
}
        }
        return "fail"
    }

    fun fu7(): String {
        synchronized(prope4) {
            try{
println("""TRY""");

                fu2()
                throw Kla0(executionType.name)
} catch (e: Kla0){
println("""CATCH e: Kla0""");

                return e.message!!
} finally{
println("""FINALLY""");

                "123"
}
        }
        return "fail"
    }

    fun fu8(): String {
        synchronized(prope4) {
            try{
println("""TRY""");

                fu2()
                throw Kla0(executionType.name)
} catch (e: Kla0){
println("""CATCH e: Kla0""");

                return "fail1"
} finally{
println("""FINALLY""");

                return executionType.name
}
        }
        return "fail"
    }

    fun fu9(): String {
        synchronized(prope4) {
            try{
println("""TRY""");

                try {
                    fu2()
                    throw Kla0(executionType.name)
                } catch (e: Kla0) {
                    return "fail1"
                } finally {
                    return executionType.name
                }
} finally{
println("""FINALLY""");

                val prope10 = 1 + 1
}
        }
        return "fail"
    }
override fun toString(): String{
var res = ""
res += name.toString()
res += executionType.toString()
return res
}}

fun fu0(type: Kla1, producer: (Int) -> Callable<String>): String {

    try{
println("""TRY""");

        val prope7 = arrayListOf<Future<String>>()
        for (i in 1..prope0) {
            prope7.add(prope6.submit (producer(i)))
        }

        prope3.countDown()
        val prope8 = prope2.await(10, TimeUnit.SECONDS)
        if (!prope8) {
println("""THEN""");
return "fail: processes not finished"
}

        for (i in 1..prope0) {
            if (prope5[i - 1] != i)
                {
println("""THEN""");
return "fail $i != ${prope5[i]}: synchronization not works : " + prope5.joinToString()
}
        }

        for (f in prope7) {
            if (f.get() != type.name) {
println("""THEN""");
return "failed result ${f.get()} != ${type.name}"
}
        }
} finally{
println("""FINALLY""");

}

    return "OK"
}

fun fu1(type: Kla1): String {
    return fu0 (type) { Kla2(it.toString(), type) }
}

fun box845(): String {
    try{
println("""TRY""");

        for (type in Kla1.values()) {
            val prope9 = fu1(type)
            if (prope9 != "OK") {
println("""THEN""");
return "fail on $type execution: $prope9"
}
        }
} finally{
println("""FINALLY""");

        prope6.shutdown()
}
    return "OK"
}

fun box169(): String {
    val prope11 = ArrayList<Int>()
    for (i in (3..9 step 2).reversed()) {
        prope11.add(i)
        if (prope11.size > 23) {
println("""THEN""");
break
}
    }
    if (prope11 != listOf<Int>(9, 7, 5, 3)){
println("""THEN""");

        return "Wrong elements for (3..9 step 2).reversed(): $prope11"
}

    val prope12 = ArrayList<Int>()
    for (i in (3.toByte()..9.toByte() step 2).reversed()) {
        prope12.add(i)
        if (prope12.size > 23) {
println("""THEN""");
break
}
    }
    if (prope12 != listOf<Int>(9, 7, 5, 3)){
println("""THEN""");

        return "Wrong elements for (3.toByte()..9.toByte() step 2).reversed(): $prope12"
}

    val prope13 = ArrayList<Int>()
    for (i in (3.toShort()..9.toShort() step 2).reversed()) {
        prope13.add(i)
        if (prope13.size > 23) {
println("""THEN""");
break
}
    }
    if (prope13 != listOf<Int>(9, 7, 5, 3)){
println("""THEN""");

        return "Wrong elements for (3.toShort()..9.toShort() step 2).reversed(): $prope13"
}

    val prope14 = ArrayList<Long>()
    for (i in (3L..9L step 2L).reversed()) {
        prope14.add(i)
        if (prope14.size > 23) {
println("""THEN""");
break
}
    }
    if (prope14 != listOf<Long>(9, 7, 5, 3)){
println("""THEN""");

        return "Wrong elements for (3L..9L step 2L).reversed(): $prope14"
}

    val prope15 = ArrayList<Char>()
    for (i in ('c'..'g' step 2).reversed()) {
        prope15.add(i)
        if (prope15.size > 23) {
println("""THEN""");
break
}
    }
    if (prope15 != listOf<Char>('g', 'e', 'c')){
println("""THEN""");

        return "Wrong elements for ('c'..'g' step 2).reversed(): $prope15"
}

    return "OK"
}


