// COMPILE != OK. Modified in 243
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// private var result = "fail"
// 
// private interface B {
// 
//     private fun test() {
//         result = "OK"
//     }
// 
//     public class Z {
//         fun ztest(b: B) {
//             b.test()
//         }
//     }
// }
// 
// open class C : B
// 
// tailrec fun box(): String {
//     B.Z().ztest(C())
//     return result
// }
// 

private var result = "fail"

private interface B {

    private fun test() {
        result = "OK"
    }

    public class Z {
        fun ztest(b: B) {
            b.test()
        }
    }
}

open class C : B

tailrec fun box(): String {
    B.run {Z().ztest(C())}
    return result
}

