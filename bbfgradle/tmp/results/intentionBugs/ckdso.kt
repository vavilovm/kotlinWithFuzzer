// COMPILE != OK. Modified in 29
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
// tailrec fun box(): String {
//     return Foo.bar
// }

object Foo {
    public fun getBar(): String

    init {
        getBar() = "OK"
    }
}

tailrec fun box(): String {
    return Foo.bar
}
