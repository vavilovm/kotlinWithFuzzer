// COMPILE != OK. Modified in 252
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.*
// 
// object Host {
//     @JvmStatic fun foo(x: String) = x
// }
// 
// open class CompanionOwner {
//     companion object {
//         @JvmStatic fun bar(x: String) = x
//     }
// }
// 
// fun box(): String =
//         (Host::foo).call("O") + (CompanionOwner.Companion::bar).call("K")
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.*

object Host {
    @JvmStatic fun foo(x: String) = x
}

open class CompanionOwner {
    companion object {
        @JvmStatic fun bar(x: String) = x
    }
}

fun box(): String =
        ({ x: String -> Host.foo(x) }).call("O") + (CompanionOwner.Companion::bar).call("K")

