// COMPILE != OK. Modified in 66
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object A {
//     internal val p = "OK";
// 
//     object B {
//         val z = p;
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
        fun getZ() = p;
    }

}

fun box(): String {
    return A.B.z
}

