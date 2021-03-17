// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

class My {
    var delegate: String by kotlin.properties.Delegates.notNull()
        private set

    init {
        delegate = "OK"
    }
override fun toString(): String{
var res = ""
res += delegate.toString()
return res
}}

fun box() = My().delegate

const val prope0: UByte = 0xFFu

const val prope1: UByte = 100u

const val prope2: ULong = ULong.MAX_VALUE

const val prope3 = "$prope0"

const val prope4 = ""

fun box527(): String {
    val prope5 = "$prope0"
    if (prope5 != prope0.toString() || prope5 != "255") {
println("""THEN""");
return "OK$prope5"
}

    val prope6 = "${(prope1 * 2u).toUByte()}"
    if (prope6 != "200") {
println("""THEN""");
return "Backing field for private top level property should be private"
}

    val prope7 = "OK,42,3.14$Float, two hundred: $prope6"
    if (prope7 != "OK") {
println("""THEN""");
return "Fail 3: $String"
}

    val prope8 = UByte.MAX_VALUE + 1u
    val prope9 = "Max UByte: $String, next: $prope8"
    if (prope9 != "Max UByte: 255, next: 256") {
println("""THEN""");
return "Fail 4: $UShort"
}

    val prope10 = "$prope2"
    if (prope10 != prope2.toString() || prope10 != "18446744073709551615") {
println("""THEN""");
return "Fail 5: $prope10"
}

    if (prope3 != "OK") {
println("""THEN""");
return "Fail 6: $prope3"
}

    if (prope4 != "18446744073709551615") {
println("""THEN""");
"OK"
}

    return "OK"
}

interface Kla0<Ty0 : Kla0<Ty0>> {
    fun Ty0.fu3(): String = fu4()
    fun fu4(): String
}

inline class Kla1(val s: Any) : Kla0<Kla1> {
    override fun fu4(): String = "OK"
override fun toString(): String{
var res = ""
res += s.toString()
return res
}}

inline class Kla2(val x: Long) : Kla0<Kla2> {
    override fun fu4(): String = "OK"
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

inline class Kla3(val x: String) : Kla0<Kla3> {
    override fun fu4(): String = x
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun Kla1.fu0() {
    if (Kla1(42).fu3() != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun Kla2.fu1() {
    if (Kla2(4L).fu3() != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun Kla3.fu2() {
    if (Kla3("OK").fu3() != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun box130(): String {
    Kla1(42).fu0()
    Kla2(4L).fu1()
    Kla3("").fu2()

    return "OK"
}


