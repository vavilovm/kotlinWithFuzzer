// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

//WITH_REFLECT

//WITH_REFLECT

import kotlin.properties.Delegates

interface MyInterface {
    fun something(): String {
        var foo: String by Delegates.notNull();
        foo = "OK"
        return foo
    }
}

fun box(): String {
    return object : MyInterface {

    }.something()
}
