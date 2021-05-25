// PSI ERROR. Modified in 81
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// @Target(AnnotationTarget.PROPERTY)
// public  annotation class Anno
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
//     open val Z.r: String get() = s
// }
// 
// tailrec fun box(): String {
//     with(A()) {
//         return Z("OK").r
//     }
// }
// 

@Target(AnnotationTarget.PROPERTY)
public  annotation class Anno

inline class Z( s: String){
val s = soverride fun toString(): String{
var res = ""
return res
}
}

class A {
    @Anno
    open val Z.r: String get() = s
}

tailrec fun box(): String {
    with(A()) {
        return Z("OK").r
    }
}

