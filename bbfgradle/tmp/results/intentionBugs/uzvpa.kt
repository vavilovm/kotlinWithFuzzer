// COMPILE != OK. Modified in 188
// MODIFIED by Convert property to function intention:
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
// tailrec fun box(): String {
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
    fun Z.getR(): String = s
}

tailrec fun box(): String {
    with(A()) {
        return Z("OK").r
    }
}

