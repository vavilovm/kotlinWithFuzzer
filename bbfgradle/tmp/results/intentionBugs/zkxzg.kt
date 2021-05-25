// COMPILE != OK. Modified in 214
// MODIFIED by Convert to with intention:
// ORIGINAL CODE:
// public var result = "fail"
// 
// interface B {
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
// class C : B
// 
// fun box(): String {
//     B.Z().ztest(C())
//     return result
// }
// 

public var result = "fail"

interface B {

    private fun test() {
        result = "OK"
    }

    class Z {
        fun ztest(b: B) {
            b.test()
        }
    }
}

class C : B

fun box(): String {
    with(B) {Z().ztest(C())}
    return result
}

