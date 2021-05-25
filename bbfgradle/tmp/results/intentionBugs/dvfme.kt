// COMPILE != OK. Modified in 31
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Test {
//     internal val ok = "OK"
// }
// 
// tailrec fun box(): String =
//         Test.ok

object Test {
    internal fun getOk() = "OK"
}

tailrec fun box(): String =
        Test.ok
