// COMPILE != OK. Modified in 26
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Foo {
//     open val bar: String
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
    open fun getBar(): String

    init {
        getBar() = "OK"
    }
}

fun box(): String {
    return Foo.bar
}
