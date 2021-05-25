// COMPILE != OK. Modified in 234
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// public var result = "fail"
// 
// public sealed interface B {
// 
//     private fun test() {
//         result = "OK"
//     }
// 
//     class Z {
//         infix fun ztest(b: B) {
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

public sealed interface B {

    private fun test() {
        result = "OK"
    }

    class Z {
        infix fun ztest(b: B) {
            b.test()
        }
    }
}

class C : B

fun box(): String {
    B.run {Z().ztest(C())}
    return result
}

