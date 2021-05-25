// PSI ERROR. Modified in 17
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  enum class Test(val str: String = "OK") {
//     OK {
//         fun foo() {}
//     }
// }
// 
// tailrec fun box(): String =
//         Test.OK.str

 enum class Test( str: String = "OK") {
    val str = strOK {
        fun foo() {}
    }
}

tailrec fun box(): String =
        Test.OK.str
