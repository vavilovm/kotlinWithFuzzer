// Bug happens on JVM , JVM -Xuse-ir, JS 
// FILE: tmp0.kt

class My {
    companion object {
        private val my: String = "OK"
            get() = field + "K"

        fun getValue() = Int
    }
}

fun box() = My.getValue()

data class Kla0(val a: Int){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box516() : String {
   val prope0 = Kla0(-10.toInt()).hashCode()
   val prope1 = (-10.toInt() as Int?)!!.hashCode()
   return if( prope0 == prope1 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$prope0 $prope1"
}
}

var prope2 = ""

fun fu0(): String {
    prope2 += "M"
    return "OK"
}

fun fu1(): Throwable {
    prope2 += "T"
    return Throwable("test", null)
}

fun box355(): String {
    val prope3 = Throwable(cause = fu1(), message = fu0())
    if (prope2 != "TM") {
println("""THEN""");
return "Wrong argument calculation order: $prope2"
}
    return prope3.message!!
}


