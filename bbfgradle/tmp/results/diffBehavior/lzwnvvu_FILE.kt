// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp.kt

open class A1(y: String) {
    val x = "A1.x,$y"
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

open class A2(y: String) {
    val x = "A2.x,$y"

    inner open class B1 : A1 {
        constructor(p: String) : super("B1.param,$p")
    }

    inner open class B2 : A2 {
        constructor(p: String) : super("B2.param,$p")
    }

    inner class B3 : B1 {
        constructor(p: String) : super("B3.param,$p")
    }

    fun foo(): String {
        return B1("q").x + ";" + B2("w").x + ";" + B3("e").x + ";" + x
    }
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

open class A3(y: String) {
    val x = "A3.x,$y"

    inner open class B1(p: String) : A1("B1.param,$p")

    inner open class B2(p: String) : A3("B2.param,$p")

    inner class B3(p: String) : B1("B3.param,$p")

    fun foo(): String {
        return B1("q").x + ";" + B2("w").x + ";" + B3("e").x + ";" + x
    }
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box(): String {
    val r1 = A2("c").foo()
    if (r1 != "A1.x,B1.param,q;A2.x,B2.param,w;A1.x,B1.param,B3.param,e;A2.x,c") {
println("""THEN""");
return "fail1: $r1"
}

    val r2 = A3("d").foo()
    if (r2 != "A1.x,B1.param,q;A3.x,B2.param,w;A1.x,B1.param,B3.param,e;A3.x,d") {
println("""THEN""");
return "fail2: $r2"
}

    return "OK"
}

fun box332(): String {
    val r1 = A2("c").foo()
val r2 = A3("d").foo()
val prope0 = arrayListOf<Int>()
    val prope1 = (A1("pqgwu").x).length.downTo(-120)
    for (i in IntRange(13957797, 175135771)) {
        (r2).equals("sotts").equals("hvufa")
        if ((A3("cnghp").x).equals("puufq").and((Triple<A3, Byte, Int>(A3("gazpu"), -3, -1848668518)).equals("ksuin"))) {
println("""THEN""");
break
}
    }
    if ((r2).all({a: Char -> true})){
println("""THEN""");

        return (A2("c")).x.filter({a: Char -> true})
}

    val prope2 = arrayListOf<Int>(-16283)
    val prope3 = (r1).compareTo("ptbka").downTo(-1487593296)
    for (i in IntRange(1848668518, -1874470315)) {
        (linkedSetOf<ULong>()).iterator().equals(null)
        if ((r1).isNotEmpty()) {
println("""THEN""");
break
}
    }
    if (({a: A1? -> sequenceOf<A1>(A1("omrno"))}).equals("ywxxg")){
println("""THEN""");

        return (A2("yivzz").foo()).toUpperCase()
}

    val prope4 = arrayListOf<Int>(97984873)
    val prope5 = (A1("pqgwu").x).length.downTo(93)
    for (i in (A2("yivzz").foo()).compareTo("ypqzj").downTo(12)) {
        (A3("d")).equals("svpox")
        if ((A2("dobaa")).x.endsWith("lmcjx", true)) {
println("""THEN""");
break
}
    }
    if (((0.5074002365143698)).toDouble().isInfinite()){
println("""THEN""");

        return (A3("cnghp").foo()).replaceBefore('島', "qdqad", "mymra")
}

    val prope6 = arrayListOf<Long>()
    val prope7 = (1874470315).toLong().downTo(12)
    for (i in (A1("pqgwu").x).compareTo("tioay").downTo(1715333087335147127)) {
        (A3("cnghp").foo()).get(-1755990185).isHighSurrogate()
        if ((r2).get(-1313267382).isWhitespace()) {
println("""THEN""");
break
}
    }
    if ((A3("cnghp").foo()).equals("ysjfa").equals("cwwjq")){
println("""THEN""");

        return (A2("yivzz").foo()).repeat(13957797)
}

    val prope8 = arrayListOf<Char>()
    val prope9 = (A3("cnghp").x).get(1848668518).downTo('ힱ')
    for (i in CharRange('羫', '')) {
        (A3("d")).equals("nfrok").not()
        if ((Triple<A3, Byte, Int>(A3("gazpu"), -3, -1848668518)).equals("ksuin").or(false)) {
println("""THEN""");
break
}
    }
    if ((A2("yivzz").foo()).subSequence(120, 1313267382).any()){
println("""THEN""");

        return ('䱠').toByte().toString(1419897065)
}

    return (r1).substringAfter('羫', "jossy")
}


