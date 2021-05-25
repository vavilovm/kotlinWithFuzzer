// COMPILE != OK. Modified in 73
// MODIFIED by Convert property to function intention:
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
        public fun getZ() = p;
    }

}

fun box(): String {
    return A.B.z
}

