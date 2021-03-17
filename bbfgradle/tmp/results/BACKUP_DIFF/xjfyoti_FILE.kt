// Bug happens on JVM , JS 
// FILE: tmp0.kt

open abstract class B {
    abstract fun foo2(arg: Int = 239) : Int
}

class C : B() {
    override fun foo2(arg: Int) : Int = arg
}

fun box() : String {
    if(C().foo2() != 239) {
println("""THEN""");
return "fail"
}
    if(C().foo2(10) != 10) {
println("""THEN""");
return "fail"
}
    return "OK"
}

interface Kla0

interface Kla1

fun <Ty0> Ty0.fu0(): String where Ty0 : Kla0, Ty0 : Kla1 {
    return "OK"
}

class Kla2 : Kla0, Kla1 {
    fun fu1(): String {
        return (C().foo2(C().foo2(10))).toChar().toString()
    }
}

fun box118(): String {
    return Kla2().fu1()
}

open class Kla3<Ty1>(val value: Ty1){
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

class Kla4(): Kla3<Long>((C().foo2()).compareTo(-2137656814).plus(-8794154713303353303))

fun box284(): String {
    val prope0: Long? = ((C().foo2(C().foo2(10)))).toByte().rem(-6461076749651474397)
    return (C().foo2(C().foo2(239))).toDouble().toString()
}


