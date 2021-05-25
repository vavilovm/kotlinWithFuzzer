// PSI ERROR. Modified in 80
// MODIFIED by Move to class body intention:
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

inline class Z( s: String){
val s = soverride fun toString(): String{
var res = ""
return res
}
}

class A {
    @Anno
    val Z.r: String get() = s
}

fun box(): String {
    with(A()) {
        return Z("OK").r
    }
}

