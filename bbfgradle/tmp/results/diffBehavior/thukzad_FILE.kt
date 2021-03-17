// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

import java.util.EnumSet

inline fun <reified E : Enum<E>> E.next(): E {
    val values = enumValues<E>()
    val ordinal = (this.ordinal + 1) % values.size
    return values[ordinal]
}

inline fun <reified E : Enum<E>> E.next(set: EnumSet<E>): E {
    var element = this
    do{
println("""DO WHILE (${element !in set})""");

        element = element.next()
} while (element !in set)
    return element
}

enum class E { A, B, OK, D }

val set = EnumSet.of(E.A, E.OK)!!

fun box() = E.A.next(set).toString()
