// COMPILE != OK. Modified in 462
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.full.*
// import kotlin.test.assertEquals
// import kotlin.test.assertNotNull
// import kotlin.test.assertNull
// 
// class A {
//     infix fun String.memExt(param: Int) {}
// }
// 
// tailrec fun topLevel() {}
// 
// fun Int.ext(vararg o: Any) {}
// 
// fun box(): String {
//     A::class.members.single { it.name == "memExt" }.let {
//         assertNotNull(it.instanceParameter)
//         assertNotNull(it.extensionReceiverParameter)
//         assertEquals(1, it.valueParameters.size)
//     }
// 
//     ::topLevel.let {
//         assertNull(it.instanceParameter)
//         assertNull(it.extensionReceiverParameter)
//         assertEquals(0, it.valueParameters.size)
//     }
// 
//     Int::ext.let {
//         assertNull(it.instanceParameter)
//         assertNotNull(it.extensionReceiverParameter)
//         assertEquals(1, it.valueParameters.size)
//     }
// 
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.full.*
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class A {
    infix fun String.memExt(param: Int) {}
}

tailrec fun topLevel() {}

fun Int.ext(vararg o: Any) {}

fun box(): String {
    A::class.members.single(fun(): Boolean {
    return it.name == "memExt"
}).let {
        assertNotNull(it.instanceParameter)
        assertNotNull(it.extensionReceiverParameter)
        assertEquals(1, it.valueParameters.size)
    }

    ::topLevel.let {
        assertNull(it.instanceParameter)
        assertNull(it.extensionReceiverParameter)
        assertEquals(0, it.valueParameters.size)
    }

    Int::ext.let {
        assertNull(it.instanceParameter)
        assertNotNull(it.extensionReceiverParameter)
        assertEquals(1, it.valueParameters.size)
    }

    return "OK"
}

