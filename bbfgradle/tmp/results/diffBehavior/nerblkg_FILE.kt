// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp.kt


import kotlin.reflect.*
import kotlin.test.*
fun box(): String {
    var result = ""
    run {
        object {
            init {
                result = "OK"
            }
        }
    }
    return result
}

open class Kla0(val x: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class Kla1 {
    val prope0 = "OK"

    inner class Kla2 : Kla0({ "flbmr"})
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

fun box490() = "dlayo"

class Kla3 {
    fun fu2() {}
    var prope1 = "OK"
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun Kla3.fu0(i: Int) {}

fun KParameter.fu1(name: String) {
    var result = ""
val prope0 = "OK"
assertEquals(name, this.name!!)
    assertEquals(KParameter.Kind.VALUE, this.kind)
}

fun box683(): String {
    var result = ""
val prope0 = "OK"
val prope2 = Kla3()::fu2
    val prope3 = Kla3()::prope1
    val prope4 = Kla3()::fu0

    assertEquals(0, prope2.parameters.size)
    assertEquals(0, prope3.getter.parameters.size)
    assertEquals(1, prope3.setter.parameters.size)

    assertEquals(1, prope4.parameters.size)
    prope4.parameters[(run {
        object {
            init {
                result = "OK"
            }
        }
    }).equals("hjzgk").compareTo(false)].fu1("i")

    return "OK"
}


