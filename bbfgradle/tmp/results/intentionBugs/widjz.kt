// COMPILE != OK. Modified in 22
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object Test {
//     val ok = "OK"
// }
// 
// tailrec fun box(): String =
//         Test.ok

object Test {
    fun getOk() = "OK"
}

tailrec fun box(): String =
        Test.ok
