// COMPILE != OK. Modified in 71
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object A {
//     public val p = "OK";
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
    public val p = "OK";

    object B {
        public fun getZ() = p;
    }

}

fun box(): String {
    return A.B.z
}

