// COMPILE != OK. Modified in 371
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
//  fun foo(a: Int, vararg b: Int, f: (IntArray) -> String): String {
//   return "test" + a + " " + f(b)
// }
// 
// tailrec fun box(): String {
//   val test1 = foo(1) {a -> "" + a.size}
//   if (test1 != "test1 0") {
// println("""THEN""");
// return test1
// }
// 
//   val test2 = foo(2, 2) {a -> "" + a.size}
//   if (test2 != "test2 1") {
// println("""THEN""");
// return test2
// }
// 
//   val test3 = foo(3, 2, 3) {a -> "" + a.size}
//   if (test3 != "test3 2") {
// println("""THEN""");
// return test3
// }
// 
//   return "OK"
// }
// 

 fun foo(a: Int, vararg b: Int, f: (IntArray) -> String): String {
  return "test" + a + " " + f(b)
}

tailrec fun box(): String {
  val test1 = foo(1) {a -> "" + a.size}
  if (test1 != "test1 0") {
println("""THEN""");
return test1
}

  val test2 = foo(2, 2) {a -> "" + a.size}
  if (test2 != "test2 1") {
println("""THEN""");
return test2
}

  val test3 = foo(3, 2, 3,fun(a: Any): String {
    return "" + a.size
})
  if (test3 != "test3 2") {
println("""THEN""");
return test3
}

  return "OK"
}

