// COMPILE != OK. Modified in 687
// MODIFIED by Replace with a 'forEach' function call intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // KJS_WITH_FULL_RUNTIME
// // Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// // WITH_RUNTIME
// 
// 
// val MinUI = UInt.MIN_VALUE
// const val MinUB = UByte.MIN_VALUE
// val MinUS = UShort.MIN_VALUE
// val MinUL = ULong.MIN_VALUE
// 
// fun box(): String {
//     val list1 = ArrayList<UInt>()
//     for (i in (MinUI + 5u) downTo MinUI step 3) {
//         list1.add(i)
//         if (list1.size > 23) {
// println("""THEN""");
// break
// }
//     }
//     if (list1 != listOf<UInt>(MinUI + 5u, MinUI + 2u)){
// println("""THEN""");
// 
//         return "Wrong elements for (MinUI + 5u) downTo MinUI step 3: $list1"
// }
// 
//     val list2 = ArrayList<UInt>()
//     for (i in (MinUB + 5u).toUByte() downTo MinUB step 3) {
//         list2.add(i)
//         if (list2.size > 23) {
// println("""THEN""");
// break
// }
//     }
//     if (list2 != listOf<UInt>((MinUB + 5u).toUInt(), (MinUB + 2u).toUInt())){
// println("""THEN""");
// 
//         return "Wrong elements for (MinUB + 5u).toUByte() downTo MinUB step 3: $list2"
// }
// 
//     val list3 = ArrayList<UInt>()
//     for (i in (MinUS + 5u).toUShort() downTo MinUS step 3) {
//         list3.add(i)
//         if (list3.size > 23) {
// println("""THEN""");
// break
// }
//     }
//     if (list3 != listOf<UInt>((MinUS + 5u).toUInt(), (MinUS + 2u).toUInt())){
// println("""THEN""");
// 
//         return "Wrong elements for (MinUS + 5u).toUShort() downTo MinUS step 3: $list3"
// }
// 
//     val list4 = ArrayList<ULong>()
//     for (i in MinUL + 5u downTo MinUL step 3) {
//         list4.add(i)
//         if (list4.size > 23) {
// println("""THEN""");
// break
// }
//     }
//     if (list4 != listOf<ULong>((MinUL + 5u), (MinUL + 2u))){
// println("""THEN""");
// 
//         return "Wrong elements for MinUL + 5u downTo MinUL step 3: $list4"
// }
// 
//     return "OK"
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


val MinUI = UInt.MIN_VALUE
const val MinUB = UByte.MIN_VALUE
val MinUS = UShort.MIN_VALUE
val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in (MinUI + 5u) downTo MinUI step 3) {
        list1.add(i)
        if (list1.size > 23) {
println("""THEN""");
break
}
    }
    if (list1 != listOf<UInt>(MinUI + 5u, MinUI + 2u)){
println("""THEN""");

        return "Wrong elements for (MinUI + 5u) downTo MinUI step 3: $list1"
}

    val list2 = ArrayList<UInt>()
    ((MinUB + 5u).toUByte() downTo MinUB step 3).forEach { i ->
        list2.add(i)
        if (list2.size > 23) {
            println("""THEN""");
            break
        }
    }
    if (list2 != listOf<UInt>((MinUB + 5u).toUInt(), (MinUB + 2u).toUInt())){
println("""THEN""");

        return "Wrong elements for (MinUB + 5u).toUByte() downTo MinUB step 3: $list2"
}

    val list3 = ArrayList<UInt>()
    for (i in (MinUS + 5u).toUShort() downTo MinUS step 3) {
        list3.add(i)
        if (list3.size > 23) {
println("""THEN""");
break
}
    }
    if (list3 != listOf<UInt>((MinUS + 5u).toUInt(), (MinUS + 2u).toUInt())){
println("""THEN""");

        return "Wrong elements for (MinUS + 5u).toUShort() downTo MinUS step 3: $list3"
}

    val list4 = ArrayList<ULong>()
    for (i in MinUL + 5u downTo MinUL step 3) {
        list4.add(i)
        if (list4.size > 23) {
println("""THEN""");
break
}
    }
    if (list4 != listOf<ULong>((MinUL + 5u), (MinUL + 2u))){
println("""THEN""");

        return "Wrong elements for MinUL + 5u downTo MinUL step 3: $list4"
}

    return "OK"
}

