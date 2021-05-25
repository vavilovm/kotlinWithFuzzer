// COMPILE != OK. Modified in 28
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Foo {
//     public val bar: String
// 
//     init {
//         bar = "OK"
//     }
// }
// 
// fun box(): String {
//     return Foo.bar
// }

object Foo {
    public fun getBar(): String

    init {
        getBar() = "OK"
    }
}

fun box(): String {
    return Foo.bar
}
