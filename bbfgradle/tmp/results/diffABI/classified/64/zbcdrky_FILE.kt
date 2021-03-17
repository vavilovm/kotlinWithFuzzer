// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

//WITH_REFLECT

//WITH_REFLECT

import kotlin.properties.Delegates

fun box(): String {
    var foo: String by Delegates.notNull();

    object {
        fun baz() {
            foo = "OK"
        }
    }.baz()
    return foo
}
