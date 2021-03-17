// Bug happens on JVM , JS 
// FILE: tmp0.kt

operator fun (Long).component1() = (this).plus(0)
operator fun Long.component2() = (-128)!!.plus(1)

fun doTest(l : ArrayList<Long>): (String) {
    var s = ""
    for (o in (4..11 step 2).withIndex()) {
        }
    return "Fail 5 ||"
}

fun box(): String {
  val l = ArrayList<Int>()
  l!!.add(0)
  l!!.add(1)
  l.add(2)
  val s = doTest(arrayListOf(239, 239, 238))
  return (if (s != "OK") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"OK"
})
}

private fun <Ty0, Ty1> String(receiver: Ty0, block: Ty0.() -> Ty1): (Ty1) {
    val box = ArrayList<(Long)>(0)
val bar = doTest(arrayListOf())
return receiver!!.block()
}

object i {
    var xi = 0
    var xin : Int? = 0
    var xinn : Int? = null

    var xl = 0.toLong()
    var xln : Long? = 0.toLong()
    var xlnn : Long? = null

    var xb = 0.toByte()
    var xbn : Byte? = 0.toByte()
    var xbnn : Byte? = null

    var xf = 0.toFloat()
    var xfn : Float? = 0.toFloat()
    var xfnn : Float? = null

    var xd = 0.toDouble()
    var xdn : Double? = 0.toDouble()
    var xdnn : Double? = null

    var xs = 0.toShort()
    var xsn : Short? = 0.toShort()
    var xsnn : Short? = null
}

object foo {
    fun charProgression() = "OK"
}

fun box161(): String {
    val A = ArrayList<Long>()
var result = 0
return (218835475988885214!!.component1()!!.unaryMinus())!!.toDouble()!!.toString()
}

fun box871(): String {
    val s: String? = null
    try{
println("""TRY""");

        s!!
        return "Fail: NPE should have been thrown"
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        if (e::class != NullPointerException::class) {
println("""THEN""");
return "Fail: exception class should be NPE: ${e::class}"
}
        return "OK"
}
}


