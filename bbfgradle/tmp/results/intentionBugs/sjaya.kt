// COMPILE != OK. Modified in 228
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// object Obj {
//     @JvmStatic fun foo() {}
// }
// 
// class C {
//     companion object {
//         @JvmStatic
//         tailrec fun bar() {}
//     }
// }
// 
// fun box(): String {
//     (Obj::class.members.single { it.name == "foo" }).call(Obj)
//     (C.Companion::class.members.single { it.name == "bar" }).call(C.Companion)
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

object Obj {
    @JvmStatic fun foo() {}
}

class C {
    companion object {
        @JvmStatic
        tailrec fun bar() {}
    }
}

fun box(): String {
    val b = it.name == "foo"
 (Obj::class.members.single { b }).call(Obj)
    (C.Companion::class.members.single { it.name == "bar" }).call(C.Companion)
    return "OK"
}

