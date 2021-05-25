// PSI ERROR. Modified in 110
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  interface IFoo {
//     fun foo(): String
// }
// 
// open interface IBar {
//     fun bar(): String
// }
// 
// abstract class Base(val x: IFoo){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// enum class Test : IFoo, IBar {
//     FOO {
//         // FOO referenced from inner class constructor with uninitialized 'this'
//         open inner class Inner : Base(FOO)
// 
//         final val z = Inner()
// 
//         override fun foo() = "OK"
// 
//         override tailrec fun bar() = z.x.foo()
//     }
// }
// 
// tailrec fun box() = Test.FOO.bar()

 interface IFoo {
    fun foo(): String
}

open interface IBar {
    fun bar(): String
}

abstract class Base( x: IFoo){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}

enum class Test : IFoo, IBar {
    FOO {
        // FOO referenced from inner class constructor with uninitialized 'this'
        open inner class Inner : Base(FOO)

        final val z = Inner()

        override fun foo() = "OK"

        override tailrec fun bar() = z.x.foo()
    }
}

tailrec fun box() = Test.FOO.bar()
