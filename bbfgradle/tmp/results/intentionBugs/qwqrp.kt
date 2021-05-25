// COMPILE != OK. Modified in 61
// MODIFIED by Add 'const' modifier intention:
// ORIGINAL CODE:
// object A {
//     private val p = "OK";
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
    private val p = "OK";

    object B {
        public const val z = p;
    }

}

fun box(): String {
    return A.B.z
}

