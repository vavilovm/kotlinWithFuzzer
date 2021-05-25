// COMPILE != OK. Modified in 462
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// // FULL_JDK
// 
// // See KT-11258, KT-16616
// 
// import java.util.*
// import kotlin.test.assertEquals
// 
// tailrec fun box(): String {
//     listOf(
//             ArrayList::class,
//             LinkedList::class,
//             AbstractList::class,
//             HashSet::class,
//             TreeSet::class,
//             HashMap::class,
//             TreeMap::class,
//             AbstractMap::class,
//             AbstractMap.SimpleEntry::class
//     ).map {
//         it.members.map(Any::toString)
//     }
// 
//     assertEquals(1, Collection<Any>::size.getter(listOf(1)))
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_REFLECT
// FULL_JDK

// See KT-11258, KT-16616

import java.util.*
import kotlin.test.assertEquals

tailrec fun box(): String {
    listOf(
            ArrayList::class,
            LinkedList::class,
            AbstractList::class,
            HashSet::class,
            TreeSet::class,
            HashMap::class,
            TreeMap::class,
            AbstractMap::class,
            AbstractMap.SimpleEntry::class
    ).map(fun(): Any {
    return it.members.map(Any::toString)
})

    assertEquals(1, Collection<Any>::size.getter(listOf(1)))

    return "OK"
}

