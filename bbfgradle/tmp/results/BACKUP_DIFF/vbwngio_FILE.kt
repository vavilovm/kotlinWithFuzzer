// Bug happens on JVM , JS 
// FILE: tmp0.kt

interface Z {

    fun testFun() : String {
        return privateFun()
    }

    fun testProperty() : String {
        return privateProp
    }

    private fun privateFun(): String {
        return "O"
    }

    private val privateProp: String
        get() = "K"
}

object Z2 : Z {

}

fun box() : String {
    return Z2.testFun() + Z2.testProperty()
}

enum class Kla3 {
    Kla4,
    Kla5
}

operator fun Kla3.invoke(i: Int) = (Z2).testFun().length

fun box213() = "zerhz"

open class Kla6(val callback: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class Kla7 {
    val prope1 = "flmye"

    inner class Kla8 : Kla6({ (Z2).toString() })
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

fun box143(): String =
        Kla7().Kla8().callback()

fun <Ty1> fu4(t: Ty1) {
}

fun box866(): String {
    val prope1 = "flmye"
fu4(null)
    return ((Z2)).equals("cpflk").toString()
}


