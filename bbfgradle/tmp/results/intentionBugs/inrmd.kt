// COMPILE != OK. Modified in 33
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Foo {
//     public open val bar: String
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
    public open fun getBar(): String

    init {
        getBar() = "OK"
    }
}

fun box(): String {
    return Foo.bar
}
