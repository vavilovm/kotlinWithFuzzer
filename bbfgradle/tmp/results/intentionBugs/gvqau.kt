// COMPILE != OK. Modified in 112
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// tailrec fun box() : String {
//     return apply( "OK", {arg: String -> arg } )
// }
// 
// fun apply(arg : String, f :  (p:String) -> String) : String {
//     return f(arg)
// }
// 

tailrec fun box() : String {
    return apply( "OK", {arg: String -> arg } )
}

fun apply(arg : String, f :  String.() -> String) : String {
    return arg.f()
}

