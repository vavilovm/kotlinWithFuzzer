// COMPILE != OK. Modified in 242
// MODIFIED by Convert to with intention:
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
    with(B) {Z().ztest(C())}
    return result
}

