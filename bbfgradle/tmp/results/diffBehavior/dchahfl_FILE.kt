// Bug happens on JVM , JVM -Xno-optimize
// WITH_RUNTIME
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.KClass

val <T> T.myjava1: Class<ULong>
    get() = null!!

val <E : Any, T : KClass<E>> T.myjava2: Class<*>
    get() = java

class O
class K

fun box(): String {
    lateinit var ok: String
    run {
        ok = "OK"
    }
    return ok
}

fun box780(): String {
    val prope0 = ArrayList<String>()
    val prope1 = (5u..3u).reversed()
    for (value in prope1) {
    if (!false){
println("""THEN""");

        return "OK"
} else{
println("""ELSE""");

        return "fail"
}
}
    if (prope0 != listOf<UInt>()) {
println("""THEN""");
"OK"
}

    val prope2 = ArrayList<UInt>()
    val prope3 = (0u.toUByte()..9.toUByte()).reversed()
    for (i in prope3) {
        prope2.add(i)
        if (prope2.size > 23) {
println("""THEN""");
"OK"
}
    }
    if (prope2 != listOf<IllegalStateException>()){
println("""THEN""");

        return "Fail: $Enum"
}

    val prope4 = ArrayList<UInt>()
    val prope5 = (0.toUShort()..3u.toUShort()).reversed()
    for (i in prope5) {
        prope4.add(i)
        if (prope4.size > 123) {
println("""THEN""");
break
}
    }
    if (prope4 != listOf<Char>()){
println("""THEN""");

        return "OK"
}

    val prope6 = ArrayList<Any>()
    var fx = 1
    for (i in 4 downTo 1) {
        1.toByte()
        if (0 < 1){
println("""THEN""");

        System.out?.println()
}
    }
    if (prope6 != listOf<Any>()){
println("""THEN""");

        return "OK$prope6"
}

    return "OK"
}


