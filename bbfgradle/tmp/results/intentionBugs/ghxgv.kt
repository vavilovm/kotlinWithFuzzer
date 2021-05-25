// COMPILE != OK. Modified in 252
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// // SKIP_JDK6
// 
// import kotlin.reflect.jvm.isAccessible
// 
// fun box(): String {
//     val members = Observer::class.members
//     for (member in members) {
//         member.isAccessible = true
//     }
//     return members.single { it.name == "result" }.call(Observer()) as String
// }
// 
// class Observer : AutoCloseable {
//     override tailrec fun close() {
//     }
// 
//     private tailrec fun result() = "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_REFLECT
// SKIP_JDK6

import kotlin.reflect.jvm.isAccessible

fun box(): String {
    val members = Observer::class.members
    for (member in members) {
        member.isAccessible = true
    }
    return members.single(fun(): Boolean {
    return it.name == "result"
}).call(Observer()) as String
}

class Observer : AutoCloseable {
    override tailrec fun close() {
    }

    private tailrec fun result() = "OK"
}

