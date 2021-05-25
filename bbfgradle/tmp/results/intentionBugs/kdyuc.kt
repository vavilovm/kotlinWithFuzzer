// COMPILE != OK. Modified in 633
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// /**
//  * _Example_
//  * The following will print `1`, `2` and `3` when executed:
//  * ```
//  * arrayOf(1, 2, 3, 4, 5)
//  *   .iterator()
//  *   .stopAfter { it == 3 }
//  *   .forEach(::println)
//  * ```
//  * @return an iterator, which stops [this] Iterator after first element for which [predicate] returns `true`
//  */
// inline infix fun <T> Iterator<T>.stopAfter(crossinline predicate: (T) -> Boolean): Iterator<T> = iterator {
//   for (element in this@stopAfter) {
//     yield(element)
//     if (predicate(element)){
// println("""THEN""");
// 
//       break
// }
//   }
// }
// 
// fun box() =
//   listOf("OK", "fail").iterator().stopAfter { it == "OK" }.next()
// 

// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME

/**
 * _Example_
 * The following will print `1`, `2` and `3` when executed:
 * ```
 * arrayOf(1, 2, 3, 4, 5)
 *   .iterator()
 *   .stopAfter { it == 3 }
 *   .forEach(::println)
 * ```
 * @return an iterator, which stops [this] Iterator after first element for which [predicate] returns `true`
 */
inline infix fun <T> Iterator<T>.stopAfter(crossinline predicate: (T) -> Boolean): Iterator<T> = iterator {
  for (element in this@stopAfter) {
    yield(element)
    if (predicate(element)){
println("""THEN""");

      break
}
  }
}

fun box() =
  listOf("OK", "fail").iterator().stopAfter(fun(): Boolean {
    return it == "OK"
}).next()

