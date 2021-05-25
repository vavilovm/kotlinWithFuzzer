// PSI ERROR. Modified in 20
// MODIFIED by Convert to secondary constructor intention:
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

private  enum class Foo {
  A(),
  B(2, "b"),
  C(b = "b"),
  D(a = 2);val a:Intval b:Stringconstructor(  a: Int = 1,   b: String = "a") {
this.a = a
this.b = b
}
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

