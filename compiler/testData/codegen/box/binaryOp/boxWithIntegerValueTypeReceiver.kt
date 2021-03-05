// TARGET_BACKEND: JVM
// IGNORE_BACKEND_FIR: JVM_IR
// This test exists only to check that we don't accidentally break the buggy behavior of the old JVM backend in JVM IR (KT-42321).
// Feel free to remove it as soon as there's no language version where such code is allowed (KT-38895).

// FILE: test.kt

class K<L> {
    fun check(x: L): Boolean = x is Int
}

fun box(): String {
    val k = K<Long>()
    if (!k.check(1.plus(2))) return "Fail K plus"
    if (!k.check(1.minus(2))) return "Fail K minus"
    if (!k.check(1.times(2))) return "Fail K times"
    if (!k.check(1.div(2))) return "Fail K div"
    if (!k.check(1.rem(2))) return "Fail K rem"
    // if (!k.check(1.inc())) return "Fail K inc"   // TYPE_MISMATCH
    // if (!k.check(1.dec())) return "Fail K dec"   // TYPE_MISMATCH
    if (!k.check(1.unaryPlus())) return "Fail K unaryPlus"
    if (!k.check(1.unaryMinus())) return "Fail K unaryMinus"
    if (!k.check(1.shl(2))) return "Fail K shl"
    if (!k.check(1.shr(2))) return "Fail K shr"
    if (!k.check(1.ushr(2))) return "Fail K ushr"
    if (!k.check(1.and(2))) return "Fail K and"
    if (!k.check(1.or(2))) return "Fail K or"
    if (!k.check(1.xor(2))) return "Fail K xor"
    if (!k.check(1.inv())) return "Fail K inv"

    val j = J<Long>()
    if (!j.check(1.plus(2))) return "Fail J plus"
    if (!j.check(1.minus(2))) return "Fail J minus"
    if (!j.check(1.times(2))) return "Fail J times"
    if (!j.check(1.div(2))) return "Fail J div"
    if (!j.check(1.rem(2))) return "Fail J rem"
    // if (!j.check(1.inc())) return "Fail J inc"   // TYPE_MISMATCH
    // if (!j.check(1.dec())) return "Fail J dec"   // TYPE_MISMATCH
    if (!j.check(1.unaryPlus())) return "Fail J unaryPlus"
    if (!j.check(1.unaryMinus())) return "Fail J unaryMinus"
    if (!j.check(1.shl(2))) return "Fail J shl"
    if (!j.check(1.shr(2))) return "Fail J shr"
    if (!j.check(1.ushr(2))) return "Fail J ushr"
    if (!j.check(1.and(2))) return "Fail J and"
    if (!j.check(1.or(2))) return "Fail J or"
    if (!j.check(1.xor(2))) return "Fail J xor"
    if (!j.check(1.inv())) return "Fail J inv"

    return "OK"
}

// FILE: J.java

public class J<M> {
    public boolean check(M x) {
        return x instanceof Integer;
    }
}
