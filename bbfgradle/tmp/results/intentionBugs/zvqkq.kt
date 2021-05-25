// COMPILE != OK. Modified in 727
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// import java.util.ArrayList
// 
// internal class A<E> : List<E> by ArrayList<E>()
// 
// internal class B : List<String> by A<String>()
// 
// fun expectUoe(block: () -> Any) {
//     try{
// println("""TRY""");
// 
//         block()
//         throw AssertionError()
// } catch (e: UnsupportedOperationException){
// println("""CATCH e: UnsupportedOperationException""");
// 
// }
// }
// 
// fun box(): String {
//     val a = A<String>() as java.util.List<String>
//     expectUoe { a.add("") }
//     expectUoe { a.remove("") }
//     expectUoe { a.addAll(a) }
//     expectUoe { a.addAll(0, a) }
//     expectUoe { a.removeAll(a) }
//     expectUoe { a.retainAll(a) }
//     expectUoe { a.clear() }
//     expectUoe { a.add(0, "") }
//     expectUoe { a.set(0, "") }
//     expectUoe { a.remove(0) }
//     a.listIterator()
//     a.listIterator(0)
//     a.subList(0, 0)
// 
//     val b = B() as java.util.List<String>
//     expectUoe { b.add("") }
//     expectUoe { b.remove("") }
//     expectUoe { b.addAll(b) }
//     expectUoe { b.addAll(0, b) }
//     expectUoe { b.removeAll(b) }
//     expectUoe { b.retainAll(b) }
//     expectUoe { b.clear() }
//     expectUoe { b.add(0, "") }
//     expectUoe { b.set(0, "") }
//     expectUoe { b.remove(0) }
//     b.listIterator()
//     b.listIterator(0)
//     b.subList(0, 0)
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM

import java.util.ArrayList

internal class A<E> : List<E> by ArrayList<E>()

internal class B : List<String> by A<String>()

fun expectUoe(block: () -> Any) {
    try{
println("""TRY""");

        block()
        throw AssertionError()
} catch (e: UnsupportedOperationException){
println("""CATCH e: UnsupportedOperationException""");

}
}

fun box(): String {
    val a = A<String>() as java.util.List<String>
    expectUoe { a.add("") }
    expectUoe { a.remove("") }
    expectUoe { a.addAll(a) }
    expectUoe { a.addAll(0, a) }
    expectUoe { a.removeAll(a) }
    expectUoe { a.retainAll(a) }
    expectUoe { a.clear() }
    expectUoe { a.add(0, "") }
    expectUoe { a.set(0, "") }
    expectUoe(fun(): String? {
    return a.remove(0)
})
    a.listIterator()
    a.listIterator(0)
    a.subList(0, 0)

    val b = B() as java.util.List<String>
    expectUoe { b.add("") }
    expectUoe { b.remove("") }
    expectUoe { b.addAll(b) }
    expectUoe { b.addAll(0, b) }
    expectUoe { b.removeAll(b) }
    expectUoe { b.retainAll(b) }
    expectUoe { b.clear() }
    expectUoe { b.add(0, "") }
    expectUoe { b.set(0, "") }
    expectUoe { b.remove(0) }
    b.listIterator()
    b.listIterator(0)
    b.subList(0, 0)

    return "OK"
}

