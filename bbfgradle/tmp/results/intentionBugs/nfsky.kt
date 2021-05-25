// COMPILE != OK. Modified in 228
// MODIFIED by Convert to with intention:
// ORIGINAL CODE:
// private var result = "fail"
// 
// private interface B {
// 
//     private fun test() {
//         result = "OK"
//     }
// 
//     class Z {
//         fun ztest(b: B) {
//             b.test()
//         }
//     }
// }
// 
// open class C : B
// 
// fun box(): String {
//     B.Z().ztest(C())
//     return result
// }
// 

private var result = "fail"

private interface B {

    private fun test() {
        result = "OK"
    }

    class Z {
        fun ztest(b: B) {
            b.test()
        }
    }
}

open class C : B

fun box(): String {
    with(B) {Z().ztest(C())}
    return result
}

