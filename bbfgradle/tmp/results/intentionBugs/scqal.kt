// PSI ERROR. Modified in 24
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// private  enum class Foo(val a: Int = 1, val b: String = "a") {
//   A(),
//   B(2, "b"),
//   C(b = "b"),
//   D(a = 2)
// }
// 
// tailrec fun box(): String {
//    if (Foo.A.a != 1 || Foo.A.b != "a") {
// println("""THEN""");
// return "fail"
// }
//    if (Foo.B.a != 2 || Foo.B.b != "b") {
// println("""THEN""");
// return "fail"
// }
//    if (Foo.C.a != 1 || Foo.C.b != "b") {
// println("""THEN""");
// return "fail"
// }
//    if (Foo.D.a != 2 || Foo.D.b != "a") {
// println("""THEN""");
// return "fail"
// }
//    return "OK"
// }
// 

private  enum class Foo( a: Int = 1, val b: String = "a") {
  val a = aA(),
  B(2, "b"),
  C(b = "b"),
  D(a = 2)
}

tailrec fun box(): String {
   if (Foo.A.a != 1 || Foo.A.b != "a") {
println("""THEN""");
return "fail"
}
   if (Foo.B.a != 2 || Foo.B.b != "b") {
println("""THEN""");
return "fail"
}
   if (Foo.C.a != 1 || Foo.C.b != "b") {
println("""THEN""");
return "fail"
}
   if (Foo.D.a != 2 || Foo.D.b != "a") {
println("""THEN""");
return "fail"
}
   return "OK"
}

