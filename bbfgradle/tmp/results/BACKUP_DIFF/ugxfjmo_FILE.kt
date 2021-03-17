// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class C {
    private fun String.ext() : String = ""
    private fun f() {}

    public fun foo() : String {
        {
            "".ext()
            f()
        }.invoke()

        object : Runnable {
            public override fun run() {
                "".ext()
                f()
            }
        }.run()

        Inner().innerFun()

        return "OK"
    }

    private inner class Inner() {
        fun innerFun() {
            "".ext()
            f()
        }
    }
}

interface Runnable {
    fun run(): Unit
}

fun box() = C().foo()

interface Kla0 {
    private fun fu0() = "OK"

    public fun fu1() = fu0()
}

class Kla1 : Kla0 {
    private fun fu0() = "fail"
}

fun box123() = Kla1().fu1()

data class Kla2(val a: Long){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box326() : String {
   val prope0 = Kla2(-10.toLong()).hashCode()
   val prope1 = (-10.toLong() as Long?)!!.hashCode()
   return if( prope0 == prope1 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$prope0 $prope1"
}
}

fun box610(): String {
    val prope2 = ArrayList<IntRange>()
    prope2.add(1..3)
    prope2[0].start
    return "OK"
}


