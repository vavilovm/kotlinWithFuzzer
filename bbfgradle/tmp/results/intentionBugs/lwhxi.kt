// COMPILE != OK. Modified in 148
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_RUNTIME
// 
// object A {
// 
//     private @JvmStatic fun a(): String {
//         return "OK"
//     }
// 
//     object Z {
//         val p = a()
//     }
// }
// 
// tailrec fun box(): String {
//     return A.Z.p
// }
// 

// TARGET_BACKEND: JVM

// WITH_RUNTIME

object A {

    private @JvmStatic fun a(): String {
        return "OK"
    }

    object Z {
        fun getP() = a()
    }
}

tailrec fun box(): String {
    return A.Z.p
}

