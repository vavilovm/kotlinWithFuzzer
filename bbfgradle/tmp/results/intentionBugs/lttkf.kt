// PSI ERROR. Modified in 78
// MODIFIED by Convert to secondary constructor intention:
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

inline class Z{
val s:Stringconstructor(  s: String) {
this.s = s
}override fun toString(): String{
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

