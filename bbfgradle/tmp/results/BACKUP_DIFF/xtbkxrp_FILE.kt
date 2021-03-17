// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.reflect.KProperty
import kotlin.test.*
inline class R(private val r: Int) {
    fun test() = pv

    companion object {
        private val pv = "OK"
    }
override fun toString(): String{
var res = ""
res += r.toString()
return res
}}

fun box() = R(0).test()

class Kla4 {
    var prope6 = 1
    operator fun getValue(t: Any?, p: KProperty<*>): Int = prope6
override fun toString(): String{
var res = ""
res += prope6.toString()
return res
}}

class Kla5 {
  operator fun Kla4.setValue(t: Any?, p: KProperty<*>, i: Int) { prope6 = i }

  var prope7: Int by Kla4()
override fun toString(): String{
var res = ""
res += prope7.toString()
return res
}}

fun box688(): String {
  val prope8 = Kla5()
  if(prope8.prope7 != 1) {
println("""THEN""");
return "fail get"
}
  prope8.prope7 = 2
  if (prope8.prope7 != 2) {
println("""THEN""");
return "fail set"
}
  return "OK"
}

operator fun Long.component1() = this + 1

operator fun Long.component2() = this + 2

fun fu2(): String {
    var prope9 = ""
    for ((Ty1, Ty2) in 0.toLong().rangeTo(2.toLong())) {
      prope9 += {"$Ty1:$Ty2;"}()
    }
    return prope9
}

fun box300(): String {
  val prope9 = fu2()
  return if (prope9 == "1:2;2:3;3:4;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $prope9"
}
}

fun box753(): String {
    var prope10 = ""

    var prope11: Any? = null
    for (t in arrayOf("1", "2", "3")) {
        class Kla6() {
            val prope13 = t

            inner class Kla7() {
                fun fu3() = Kla6()
            }
        override fun toString(): String{
var res = ""
res += prope13.toString()
return res
}}

        if (prope11 == null){
println("""THEN""");

            prope11 = Kla6()
}

        val prope12 = (prope11 as Kla6).Kla7().fu3()
        prope10 += prope12.prope13
    }

    if (prope10 != "111") {
println("""THEN""");
return "fail: ${prope10}"
}

    return "OK"
}

fun fu4() = 2

fun box374(): String {
    val prope14 = mutableListOf<UInt>()
    val prope15 = 1u..8u
    for (i in prope15 step fu4()) {
        prope14 += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), prope14)

    val prope16 = mutableListOf<ULong>()
    val prope17 = 1uL..8uL
    for (i in prope17 step fu4().toLong()) {
        prope16 += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL), prope16)

    return "OK"
}

val prope18: Kla8 by lazy {
    object : Kla8 {   }
}

private val prope19 by lazy {
    object : Kla8 { }
}

private val prope20 by lazy {
    object : Kla8, Kla9 { }
}

interface Kla8

interface Kla9

fun box720(): String {
    prope18
    prope19
    prope20
    return "OK"
}

val prope21: Any? = true

val prope22: Any? = null

val prope23: Boolean = true

val prope24: Boolean = false

fun box324(): String {
    val prope25: Any? = true
    val prope26: Any? = null
    val prope27: Boolean = true
    val prope28: Boolean = false

    return when {
        true != prope21 -> {
println("""WHEN true != prope21""");
"Fail 0"
}
        false == prope21 -> {
println("""WHEN false == prope21""");
"Fail 1"
}
        !(true == prope21) -> {
println("""WHEN !(true == prope21)""");
"Fail 2"
}
        !(false != prope21) -> {
println("""WHEN !(false != prope21)""");
"Fail 3"
}
        prope23 != prope21 -> {
println("""WHEN prope23 != prope21""");
"Fail 4"
}
        prope24 == prope21 -> {
println("""WHEN prope24 == prope21""");
"Fail 5"
}
        !(prope23 == prope21) -> {
println("""WHEN !(prope23 == prope21)""");
"Fail 6"
}
        !(prope24 != prope21) -> {
println("""WHEN !(prope24 != prope21)""");
"Fail 7"
}
        true == prope22 -> {
println("""WHEN true == prope22""");
"Fail 8"
}
        !(true != prope22) -> {
println("""WHEN !(true != prope22)""");
"Fail 9"
}
        prope23 == prope22 -> {
println("""WHEN prope23 == prope22""");
"Fail 10"
}
        !(prope23 != prope22) -> {
println("""WHEN !(prope23 != prope22)""");
"Fail 11"
}
        true != prope25 -> {
println("""WHEN true != prope25""");
"Fail 12"
}
        false == prope25 -> {
println("""WHEN false == prope25""");
"Fail 13"
}
        !(true == prope25) -> {
println("""WHEN !(true == prope25)""");
"Fail 14"
}
        !(false != prope25) -> {
println("""WHEN !(false != prope25)""");
"Fail 15"
}
        prope23 != prope25 -> {
println("""WHEN prope23 != prope25""");
"Fail 16"
}
        prope24 == prope25 -> {
println("""WHEN prope24 == prope25""");
"Fail 17"
}
        !(prope23 == prope25) -> {
println("""WHEN !(prope23 == prope25)""");
"Fail 18"
}
        !(prope24 != prope25) -> {
println("""WHEN !(prope24 != prope25)""");
"Fail 19"
}
        prope27 != prope25 -> {
println("""WHEN prope27 != prope25""");
"Fail 20"
}
        prope28 == prope25 -> {
println("""WHEN prope28 == prope25""");
"Fail 21"
}
        !(prope27 == prope25) -> {
println("""WHEN !(prope27 == prope25)""");
"Fail 22"
}
        !(prope28 != prope25) -> {
println("""WHEN !(prope28 != prope25)""");
"Fail 23"
}
        true == prope26 -> {
println("""WHEN true == prope26""");
"Fail 24"
}
        !(true != prope26) -> {
println("""WHEN !(true != prope26)""");
"Fail 25"
}
        prope23 == prope26 -> {
println("""WHEN prope23 == prope26""");
"Fail 26"
}
        !(prope23 != prope26) -> {
println("""WHEN !(prope23 != prope26)""");
"Fail 27"
}
        prope27 == prope26 -> {
println("""WHEN prope27 == prope26""");
"Fail 28"
}
        !(prope27 != prope26) -> {
println("""WHEN !(prope27 != prope26)""");
"Fail 29"
}
        else -> {
println("""WHEN """);
"OK"
}
    }
}


