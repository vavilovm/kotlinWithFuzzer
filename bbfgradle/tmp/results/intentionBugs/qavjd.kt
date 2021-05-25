// COMPILE != OK. Modified in 50
// MODIFIED by Convert to primary constructor intention:
// ORIGINAL CODE:
// private var state: String = "Fail"
// 
// class A {
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

class Aprivate constructor(x: String = "OK") {

    companion object {
        fun foo() = A()
    }
}

fun box(): String {
    A.foo()
    return state
}

