// COMPILE != OK. Modified in 298
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
//  private class A {
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
// tailrec fun box(): String {
//     val a = A()
//     if (a.f() != "OK") {
// println("""THEN""");
// return "FAIL0"
// }
//     a.g()
//     return A.v
// }

 private class A {
    companion object {
        val s = "OK"
        open var v = "NOT OK"
    }

    inline fun f(): String = s

    tailrec inline fun g() {
        v = "OK"
    }
}

tailrec fun box(): String {
    val a = A()
    if (this.f() != "OK") {
println("""THEN""");
return "FAIL0"
}
    a.run {
    if (f() != "OK") {
println("""THEN""");
return "FAIL0"
}
    g()}
    return A.v
}
