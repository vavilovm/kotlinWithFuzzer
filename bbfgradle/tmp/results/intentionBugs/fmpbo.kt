// COMPILE != OK. Modified in 59
// MODIFIED by Convert to primary constructor intention:
// ORIGINAL CODE:
// private var state: String = "Fail"
// 
// internal class A {
//     private constructor(x: String = "OK") {
//         state = x
//     }
// 
//     companion object {
//         fun foo() = A()
//     }
// }
// 
// fun box(): String {
//     A.foo()
//     return state
// }
// 

private var state: String = x

internal class Aprivate constructor(x: String = "OK") {

    companion object {
        fun foo() = A()
    }
}

fun box(): String {
    A.foo()
    return state
}

