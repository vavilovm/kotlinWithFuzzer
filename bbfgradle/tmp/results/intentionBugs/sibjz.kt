// PSI ERROR. Modified in 12
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
//  enum class Test(val str: String = "OK") {
//     OK {
//         fun foo() {}
//     }
// }
// 
// tailrec fun box(): String =
//         Test.OK.str

 enum class Test {
    OK {
        fun foo() {}
    };val str:Stringconstructor(  str: String = "OK") {
this.str = str
}
}

tailrec fun box(): String =
        Test.OK.str
