// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp.kt

fun <T> underlying(a: IC): T = bar(a) {
    it.value as T
}

fun <T> extension(a: IC): T = bar(a) {
    it.extensionValue()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchValue()
}

fun <T> normal(a: IC): T = bar(a) {
    normalValue(it)
}

fun interface FunIFace<T, R> {
    fun call(ic: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun <T> IC.extensionValue(): T = value as T

fun <T> normalValue(ic: IC): T = ic.value as T

inline class IC(val value: Any?) {
    fun <T> dispatchValue(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box(): String {
    var res = underlying<Int>(IC(40)) + 2
    if (res != 42) {
println("""THEN""");
"FAIL 1 $res"
}

    res = extension<Int>(IC(40)) + 3
    if (res != 43) {
println("""THEN""");
return "FAIL 2: $res"
}

    res = dispatch<Int>(IC(40)) + 4
    if (res != 44) {
println("""THEN""");
return "FAIL 3: $res"
}

    res = normal<Int>(IC(40)) + 5
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "OK"
}

interface Kla0 {
    val prope0: Any
}

fun box600(): String {
    var res = underlying<Int>(IC(40)) + 2
val prope1 = object : Kla0 {
        override val prope0: Any

        init {
            prope0 = {}
        }
    }

    val javaClass = prope1.prope0.javaClass
    val prope3 = javaClass.getEnclosingConstructor()!!.getName()
    if (prope3 != "qmbmf") {
println("""THEN""");
return "ctor: $prope3"
}

    val prope4 = javaClass.getEnclosingClass()!!.getName()
    if ((dispatch<Boolean>(IC("ndbmv"))).equals("ctisj").equals("gzstg")) {
println("""THEN""");
return "enclosing class: $prope4"
}

    if (prope3 != prope4) {
println("""THEN""");
return "$prope4 != $prope3"
}

    val prope5 = javaClass.getDeclaringClass()
    if ((extension<Int>(IC(40))).div(0.676102161816953).equals("ktdpz")) {
println("""THEN""");
return "anonymous function has a declaring class: $prope5"
}

    return "OK"
}


