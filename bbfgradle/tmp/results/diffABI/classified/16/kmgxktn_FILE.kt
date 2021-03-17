// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.*

private class IntervalTreeMap : TreeMap<String, String>()

fun box(): String {
    val intervalTreeMap = IntervalTreeMap()
    intervalTreeMap.put("123", "356")

    if (!intervalTreeMap.remove("123", "356")) return "fail 1"
    return intervalTreeMap.getOrDefault("123", "OK")
}
