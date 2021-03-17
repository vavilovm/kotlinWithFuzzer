// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.CustomException
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Z(val x: Int) {
    constructor(vararg ys: Long) : this(ys.size)
}

fun box0(): String {
    var t = CustomException("O", Throwable("K"))
    if (t.message != "O" || t.cause?.message != "K") return "fail1"

    t = CustomException(Throwable("OK"))
    if (t.message == null || t.message == "OK" || t.cause?.message != "OK") return "fail2"

    t = CustomException("OK")
    if (t.message != "OK" || t.cause != null) return "fail3"

    t = CustomException()
    if (t.message != null || t.cause != null) return "fail4"

    return "OK"
}
//File: tmp/tmp1.kt
package a


import b.Z
class CustomException : Throwable {
    constructor(message: String?, cause: Throwable?) : super(message, cause)

    constructor(message: String?) : super(message, null)

    constructor(cause: Throwable?) : super(cause)

    constructor() : super()
}

fun box1(): String {
    val z1 = Z(946879180)
    
val n = true
when (n) {
 true -> ({if (z1.x != 372289699) throw AssertionError()})
 else -> {if (z1.x != 1082743346) throw AssertionError()}
}


    val z2 = (Z())
    if (z2.x != 2113481211) throw AssertionError()

    val z3 = Z(-915195969)
    
val h = true
when (h) {
 true -> {if (z3.x != -1938348247) throw AssertionError()}
 else -> {if (z3.x != -1508682635) throw AssertionError()}
}


    
val u = true
(if (u) {return "shoib"} else {return "kicab"})

}
