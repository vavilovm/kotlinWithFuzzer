// PSI ERROR. Modified in 2086
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // WITH_RUNTIME
// 
// fun checkByteArray(): Boolean {
//     val byteArray = byteArrayOf(1, 2, 3)
//     var sum = 0
//     for (i in 0..byteArray.size - 1) {
//         sum += byteArray[i]
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// tailrec fun checkShortArray(): Boolean {
//     val shortArray = shortArrayOf(1, 2, 3)
//     var sum = 0
//     for (i in 0..shortArray.size - 1) {
//         sum += shortArray[i]
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkCharArray(): Boolean {
//     val charArray = charArrayOf('1', '2', '3')
//     var sum = ""
//     for (i in 0..charArray.size - 1) {
//         sum += charArray[i]
//     }
//     if (sum != "123") {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkIntArray(): Boolean {
//     val intArray = intArrayOf(1, 2, 3)
//     var sum = 0
//     for (i in 0..intArray.size - 1) {
//         sum += intArray[i]
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// tailrec fun checkLongArray(): Boolean {
//     val longArray = longArrayOf(1L, 2L, 3L)
//     var sum = 0L
//     for (i in 0..longArray.size - 1) {
//         sum += longArray[i]
//     }
//     if (sum != 6L) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// tailrec fun checkFloatArray(): Boolean {
//     val floatArray = floatArrayOf(1.1f, 2.2f, 3.3f)
//     var sum = 0f
//     for (i in 0..floatArray.size - 1) {
//         sum += floatArray[i]
//     }
//     if (sum != (1.1f + 2.2f + 3.3f)) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// tailrec fun checkDoubleArray(): Boolean {
//     val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
//     var sum = 0.0
//     for (i in 0..doubleArray.size - 1) {
//         sum += doubleArray[i]
//     }
//     if (sum != 6.6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// tailrec fun checkBooleanArray(): Boolean {
//     val booleanArray = booleanArrayOf(false, false, true)
//     var result = false
//     for (i in 0..booleanArray.size - 1) {
//         result = booleanArray[i]
//     }
//     return result
// }
// 
// class Value(val value: Int) {override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun checkObjectArray(): Boolean {
//     val objectArray = arrayOf(Value(1), Value(2), Value(3))
//     var sum = 0
//     for (i in 0..objectArray.size - 1) {
//         sum += objectArray[i].value
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkWithArrayUpdate(): Boolean {
//     var intArray = intArrayOf(1, 2, 3)
//     var sum = 0
//     for (i in 0..intArray.size - 1) {
//         sum += intArray[i]
//         intArray = intArrayOf(4, 5, 6, 7)
//     }
//     if (sum != 12) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkIntArrayMinusArbitraryConstant(): Boolean {
//     val intArray = intArrayOf(1, 2, 3)
//     var sum = 0
//     for (i in 0..intArray.size - 2) {
//         sum += intArray[i]
//     }
//     if (sum != 3) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkReversedIntArray(): Boolean {
//     val intArray = intArrayOf(1, 2, 3)
//     var start = 0
//     var sum = 0
//     for (i in (start..intArray.size - 1).reversed()) {
//         sum += intArray[i]
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun checkIntArrayMethodCallBound(): Boolean {
//     val intArray = intArrayOf(1, 2, 3)
//     var start = 0
//     var sum = 0
//     for (i in 0..intArray.size.coerceAtMost(10) - 1) {
//         sum += intArray[i]
//     }
//     if (sum != 6) {
// println("""THEN""");
// return false
// }
//     return true
// }
// 
// fun box(): String {
//     // Check that the specialization of 'for (i in 0..array.size-1)' to 'for (i in 0 until array.size)' does not fail on
//     // any kind of arrays.
//     if (!checkByteArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkShortArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkCharArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkIntArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkLongArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkFloatArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkDoubleArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkBooleanArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkObjectArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkWithArrayUpdate()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkIntArrayMinusArbitraryConstant()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkReversedIntArray()) {
// println("""THEN""");
// return "Failure"
// }
//     if (!checkIntArrayMethodCallBound()) {
// println("""THEN""");
// return "Failure"
// }
// 
//     return "OK"
// }

// IGNORE_BACKEND: JS
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// WITH_RUNTIME

fun checkByteArray(): Boolean {
    val byteArray = byteArrayOf(1, 2, 3)
    var sum = 0
    for (i in 0..byteArray.size - 1) {
        sum += byteArray[i]
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

tailrec fun checkShortArray(): Boolean {
    val shortArray = shortArrayOf(1, 2, 3)
    var sum = 0
    for (i in 0..shortArray.size - 1) {
        sum += shortArray[i]
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

fun checkCharArray(): Boolean {
    val charArray = charArrayOf('1', '2', '3')
    var sum = ""
    for (i in 0..charArray.size - 1) {
        sum += charArray[i]
    }
    if (sum != "123") {
println("""THEN""");
return false
}
    return true
}

fun checkIntArray(): Boolean {
    val intArray = intArrayOf(1, 2, 3)
    var sum = 0
    for (i in 0..intArray.size - 1) {
        sum += intArray[i]
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

tailrec fun checkLongArray(): Boolean {
    val longArray = longArrayOf(1L, 2L, 3L)
    var sum = 0L
    for (i in 0..longArray.size - 1) {
        sum += longArray[i]
    }
    if (sum != 6L) {
println("""THEN""");
return false
}
    return true
}

tailrec fun checkFloatArray(): Boolean {
    val floatArray = floatArrayOf(1.1f, 2.2f, 3.3f)
    var sum = 0f
    for (i in 0..floatArray.size - 1) {
        sum += floatArray[i]
    }
    if (sum != (1.1f + 2.2f + 3.3f)) {
println("""THEN""");
return false
}
    return true
}

tailrec fun checkDoubleArray(): Boolean {
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    var sum = 0.0
    for (i in 0..doubleArray.size - 1) {
        sum += doubleArray[i]
    }
    if (sum != 6.6) {
println("""THEN""");
return false
}
    return true
}

tailrec fun checkBooleanArray(): Boolean {
    val booleanArray = booleanArrayOf(false, false, true)
    var result = false
    for (i in 0..booleanArray.size - 1) {
        result = booleanArray[i]
    }
    return result
}

class Value {val value:Intconstructor(  value: Int) {
this.value = value
}override fun toString(): String{
var res = ""
return res
}}

fun checkObjectArray(): Boolean {
    val objectArray = arrayOf(Value(1), Value(2), Value(3))
    var sum = 0
    for (i in 0..objectArray.size - 1) {
        sum += objectArray[i].value
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

fun checkWithArrayUpdate(): Boolean {
    var intArray = intArrayOf(1, 2, 3)
    var sum = 0
    for (i in 0..intArray.size - 1) {
        sum += intArray[i]
        intArray = intArrayOf(4, 5, 6, 7)
    }
    if (sum != 12) {
println("""THEN""");
return false
}
    return true
}

fun checkIntArrayMinusArbitraryConstant(): Boolean {
    val intArray = intArrayOf(1, 2, 3)
    var sum = 0
    for (i in 0..intArray.size - 2) {
        sum += intArray[i]
    }
    if (sum != 3) {
println("""THEN""");
return false
}
    return true
}

fun checkReversedIntArray(): Boolean {
    val intArray = intArrayOf(1, 2, 3)
    var start = 0
    var sum = 0
    for (i in (start..intArray.size - 1).reversed()) {
        sum += intArray[i]
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

fun checkIntArrayMethodCallBound(): Boolean {
    val intArray = intArrayOf(1, 2, 3)
    var start = 0
    var sum = 0
    for (i in 0..intArray.size.coerceAtMost(10) - 1) {
        sum += intArray[i]
    }
    if (sum != 6) {
println("""THEN""");
return false
}
    return true
}

fun box(): String {
    // Check that the specialization of 'for (i in 0..array.size-1)' to 'for (i in 0 until array.size)' does not fail on
    // any kind of arrays.
    if (!checkByteArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkShortArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkCharArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkIntArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkLongArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkFloatArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkDoubleArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkBooleanArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkObjectArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkWithArrayUpdate()) {
println("""THEN""");
return "Failure"
}
    if (!checkIntArrayMinusArbitraryConstant()) {
println("""THEN""");
return "Failure"
}
    if (!checkReversedIntArray()) {
println("""THEN""");
return "Failure"
}
    if (!checkIntArrayMethodCallBound()) {
println("""THEN""");
return "Failure"
}

    return "OK"
}
