// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.properties.Delegates.notNull

fun box(): String {
    var bunny by notNull<String>()

    val obj = object {
        val getBunny = { bunny }
    }

    bunny = "OK"
    return obj.getBunny()
}
