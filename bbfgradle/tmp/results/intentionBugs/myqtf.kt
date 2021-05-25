// COMPILE != OK. Modified in 242
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// private var result = "fail"
// 
// interface B {
// 
//     private fun test() {
//         result = "OK"
//     }
// 
//     class Z {
//         tailrec infix fun ztest(b: B) {
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

interface B {

    private fun test() {
        result = "OK"
    }

    class Z {
        tailrec infix fun ztest(b: B) {
            b.test()
        }
    }
}

open class C : B

tailrec fun box(): String {
    B.run {Z().ztest(C())}
    return result
}

