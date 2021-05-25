// COMPILE != OK. Modified in 299
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
    (Obj::class.members.single { it.name == "foo" }).call(Obj)
    val b = it.name == "bar"
 (C.Companion::class.members.single { b }).call(C.Companion)
    return "OK"
}

