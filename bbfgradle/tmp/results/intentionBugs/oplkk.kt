// COMPILE != OK. Modified in 245
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// @Target(AnnotationTarget.PROPERTY)
// public annotation class Anno
// 
// inline class Z(val s: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// class A {
//     @Anno
//     val Z.r: String get() = s
// }
// 
// fun box(): String {
//     with(A()) {
//         return Z("OK").r
//     }
// }
// 

@Target(AnnotationTarget.PROPERTY)
public annotation class Anno

inline class Z(val s: String){
override fun toString(): String{
var res = ""
return res
}
}

class A {
    @Anno
    val Z.r: String get() = s
}

fun box(): String {
    with(A(),fun(): Any {
    return Z("OK").r
})
}

