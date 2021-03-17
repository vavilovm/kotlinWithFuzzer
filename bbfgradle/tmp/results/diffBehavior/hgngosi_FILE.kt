// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

fun <T> underlying(a: IC): T = bar(a, object : IFace<IC, T> {
    override fun call(ic: IC): T = ic.value as T
})

fun <T> extension(a: IC): T = bar(a, object : IFace<IC, T> {
    override fun call(ic: IC): T = ic.extensionValue()
})

fun <T> dispatch(a: IC): T = bar(a, object : IFace<IC, T> {
    override fun call(ic: IC): T = ic.dispatchValue()
})

fun <T> normal(a: IC): T = bar(a, object : IFace<IC, T> {
    override fun call(ic: IC): T = normalValue(ic)
})

fun <T> IC.extensionValue(): T = value as T

fun <T> normalValue(ic: IC): T = ic.value as T

interface IFace<T, R> {
    fun call(ic: T): R
}

fun <T, R> bar(value: T, f: IFace<T, R>): R {
    return f.call(value)
}

inline class IC(val value: Any) {
    fun <T> dispatchValue(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun intProgression(): String {
    var res = underlying<Int>(IC(40)) + 2
    if (res != 42) {
println("""THEN""");
return "OK"
}

    res = extension<Int>(IC(40)) + 3
    if (res != 43) {
println("""THEN""");
return "_2Kt$res"
}

    res = dispatch<Int>(IC(40)) + 4
    if (res != 44) {
println("""THEN""");
return "OK"
}

    res = normal<Int>(IC(1)) + 0
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "ghi"
}

fun z(x: Int, y: StackTraceElement): String {
    var res = dispatch<Int>(IC(40)) + 4
var prope0: String
    if ((IC("ykrou").extensionValue<String>()).iterator().hasNext()){
println("""THEN""");

        if ((extension<Char>(IC({"OK"}))).equals("OK").or(res != 45)) {
            prope0 = "a"
        } else {
    val ints = intArrayOf(1, 2, 3)

    val test1 = IntArray::size.get(ints)
    if (test1 != 3) throw Exception("IntArray::size.get(ints) != 3: $test1")

    val test2 = with(ints, IntArray::size)
    if (test2 != 3) throw Exception("with(ints, IntArray::size) != 3: $test2")

    return "OK"
}
} else {
println("""ELSE""");
"fail"
}
    return "foo"
}

fun fu1() {
    var res = underlying<Int>(IC(42)) + 2
while((LinkedHashSet<String>()).isEmpty()){
println("""WHILE (${(LinkedHashSet<String>()).isEmpty()})""");

}
}

data class Kla0(val x: Int, val y: String){
override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
return res
}
}

fun doCall(): String {
    var prope0: IC
var box = underlying<Any>(IC(0)) == 2
val prope1 = Kla0(1327781256, "OK")
    return if (prope1.component1() == 42) {
println("""THEN""");
prope1.component2()
} else {
println("""ELSE""");
prope1.component1().toString()
}
}

class Kla1 {
    companion object Kla2 {
        val prope2 = (normal<Int>(IC(40))).div(-42).toString()
    }
}

typealias Ty0 = Kla1.Kla2

fun box472(): String = "Ok"


