// COMPILE != OK. Modified in 282
// MODIFIED by Convert to with intention:
// ORIGINAL CODE:
//  class A {
//     companion object {
//         val s = "OK"
//         open var v = "NOT OK"
//     }
// 
//     inline fun f(): String = s
// 
//     tailrec inline fun g() {
//         v = "OK"
//     }
// }
// 
// fun box(): String {
//     val a = A()
//     if (a.f() != "OK") {
// println("""THEN""");
// return "FAIL0"
// }
//     a.g()
//     return A.v
// }

 class A {
    companion object {
        val s = "OK"
        open var v = "NOT OK"
    }

    inline fun f(): String = s

    tailrec inline fun g() {
        v = "OK"
    }
}

fun box(): String {
    val a = A()
    if (this.f() != "OK") {
println("""THEN""");
return "FAIL0"
}
    with(a) {
    if (f() != "OK") {
println("""THEN""");
return "FAIL0"
}
    g()}
    return A.v
}
