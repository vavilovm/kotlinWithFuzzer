// COMPILE != OK. Modified in 61
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // JVM_TARGET: 1.8
// // WITH_RUNTIME
// 
// val ua = 1234U
// const val ub = 5678U
// 
// fun box(): String {
//     if (ua.compareTo(ub) > 0){
// println("""THEN""");
// 
//         throw AssertionError()
// }
// 
//     return "OK"
// }
// 
// // 0 kotlin/UnsignedKt.uintCompare
// // 1 INVOKESTATIC java/lang/Integer.compareUnsigned \(II\)I
// 

// JVM_TARGET: 1.8
// WITH_RUNTIME

val ua = 1234U
const fun getUb() = 5678U

fun box(): String {
    if (ua.compareTo(getUb()) > 0){
println("""THEN""");

        throw AssertionError()
}

    return "OK"
}

// 0 kotlin/UnsignedKt.uintCompare
// 1 INVOKESTATIC java/lang/Integer.compareUnsigned \(II\)I

