// COMPILE != OK. Modified in 214
// MODIFIED by Convert to run intention:
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
    B.run {Z().ztest(C())}
    return result
}

