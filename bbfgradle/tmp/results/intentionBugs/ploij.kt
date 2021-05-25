// COMPILE != OK. Modified in 29
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Test {
//     public val ok = "OK"
// }
// 
// tailrec fun box(): String =
//         Test.ok

object Test {
    public fun getOk() = "OK"
}

tailrec fun box(): String =
        Test.ok
