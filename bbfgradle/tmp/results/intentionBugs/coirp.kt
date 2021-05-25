// COMPILE != OK. Modified in 62
// MODIFIED by Add 'const' modifier intention:
// ORIGINAL CODE:
// object A {
//     internal val p = "OK";
// 
//     object B {
//         public val z = p;
//     }
// 
// }
// 
// fun box(): String {
//     return A.B.z
// }
// 

object A {
    internal val p = "OK";

    object B {
        public const val z = p;
    }

}

fun box(): String {
    return A.B.z
}

