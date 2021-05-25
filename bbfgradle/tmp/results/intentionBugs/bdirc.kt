// COMPILE != OK. Modified in 97
// MODIFIED by Convert lambda expression to anonymous function intention:
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

 fun foo(f: (Int) -> Int) = f(0)

class Outer {
    class Nested {
        protected val y = foo(fun(a: Any): Any {
    return a
})
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

