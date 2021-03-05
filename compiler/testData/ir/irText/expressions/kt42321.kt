// SKIP_KT_DUMP
// This test exists only to check that we don't accidentally break the buggy behavior of the old JVM backend in JVM IR (KT-42321).
// Feel free to remove it as soon as there's no language version where such code is allowed (KT-38895).

abstract class C<L> {
    fun takeT(x: L)
}

fun test() {
    val c = C<Long>()
    c.takeT(1.plus(2))
    c.takeT(1.minus(2))
    c.takeT(1.times(2))
    c.takeT(1.div(2))
    c.takeT(1.rem(2))
    c.takeT(1.unaryPlus())
    c.takeT(1.unaryMinus())
    c.takeT(1.shl(2))
    c.takeT(1.shr(2))
    c.takeT(1.ushr(2))
    c.takeT(1.and(2))
    c.takeT(1.or(2))
    c.takeT(1.xor(2))
    c.takeT(1.inv())
}
