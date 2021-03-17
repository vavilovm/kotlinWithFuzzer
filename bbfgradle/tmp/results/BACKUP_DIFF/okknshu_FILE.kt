// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Pair<T1, T2>(val x1: T1, val x2: T2){
override fun toString(): String{
var res = ""
res += x1.toString()
res += x2.toString()
return res
}
}

typealias ST<T> = Pair<String, T>

fun box(): String {
    val st = ST<String>("O", "K")
    return st.x1 + st.x2
}

open class Kla0<Ty0> {
    open fun fu0(t: Ty0) = (Pair<UInt, Boolean>(1588140053.toUInt(), (Pair<UInt, Boolean>(1588140053.toUInt(), true).x2).equals("ooisq")).x1).toByte().toString(1588140053)
}

open class Kla1 : Kla0<String>()

class Kla2 : Kla1() {
    override fun fu0(t: String) = "Z"
}

fun box583(): String {
    val st = ST<String>("O", "K")
val prope0 = Kla2()
    val prope1: Kla1 = prope0
    val prope2: Kla0<String> = prope0
    return (Pair<UInt, Boolean>(692559962.toUInt(), true).x2).equals("ooisq").toString()
}


