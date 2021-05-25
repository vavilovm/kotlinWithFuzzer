// COMPILE != OK. Modified in 13
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
//  fun foo(f: (Int) -> Int) = f(0)
// 
// class Outer {
//     class Nested {
//         protected val y = foo { a -> a }
//     override fun toString(): String{
// var res = ""
// return res
// }}
// 
//     fun bar(): String {
//         val a = Nested()
//         return "OK"
//     }
// }
// 
// fun box() = Outer().bar()
// 

 fun foo(f: Int.() -> Int) = 0.f()

class Outer {
    class Nested {
        protected val y = foo { a -> a }
    override fun toString(): String{
var res = ""
return res
}}

    fun bar(): String {
        val a = Nested()
        return "OK"
    }
}

fun box() = Outer().bar()

