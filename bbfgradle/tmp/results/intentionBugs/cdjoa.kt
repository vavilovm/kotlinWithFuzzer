// COMPILE != OK. Modified in 131
// MODIFIED by Convert receiver to parameter intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: STDLIB_COLLECTIONS
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// infix fun <T> ArrayList<T>.findAll(predicate:  (T) -> Boolean): ArrayList<T> {
//   val result = ArrayList<T>()
//   for(t in this) {
//     if (predicate(t)) {
// println("""THEN""");
// result.add(t)
// }
//   }
//   return result
// }
// 
// 
// fun box(): String {
//   val list: ArrayList<String> = ArrayList<String>()
//   list.add("Prague")
//   list.add("St.Petersburg")
//   list.add("Moscow")
//   list.add("Munich")
// 
//   val m: ArrayList<String> = list.findAll<String>({ name: String -> name.startsWith("M")})
//   return if (m.size == 2) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail"
// }
// }
// 

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: STDLIB_COLLECTIONS
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

infix fun <T> findAll(arrayList: ArrayList<T>, predicate:  (T) -> Boolean): ArrayList<T> {
  val result = ArrayList<T>()
  for(t in arrayList) {
    if (predicate(t)) {
println("""THEN""");
result.add(t)
}
  }
  return result
}


fun box(): String {
  val list: ArrayList<String> = ArrayList<String>()
  list.add("Prague")
  list.add("St.Petersburg")
  list.add("Moscow")
  list.add("Munich")

  val m: ArrayList<String> = list.findAll<String>{ name: String -> name.startsWith("M")}
  return if (m.size == 2) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}

