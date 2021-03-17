// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// FILE: tmp0.kt


class C {
    fun member(): Int = TODO()
}
fun box()   =
C::member.call({
for (i in "") ({})
} )

