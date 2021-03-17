// Bug happens on JVM , JS 
// FILE: tmp0.kt

class A(val result: String){
override fun toString(): String{
var res = ""
res += result.toString()
return res
}
}

fun box() = (::A)("OK").result

inline fun <reified Ty0> fu0(x: Any?) = Pair(x is Ty0, x is Ty0?)

inline fun <reified Ty1> fu1(y: Any?) = fu0<Array<Ty1>>(y)

inline fun <reified Ty1> fu2(y: Any?) = fu0<Array<Ty1>?>(y)

fun box189(): String {
    val prope0 = fu1<String>(arrayOf(""))
    if (prope0.toString() != "(true, true)") {
println("""THEN""");
return "fail 1"
}

    val prope1 = fu1<String>(null)
    if (prope1.toString() != "(false, true)") {
println("""THEN""");
return "fail 3"
}

    val prope2 = fu1<String?>(null)
    if (prope2.toString() != "(false, true)") {
println("""THEN""");
return "fail 4"
}

    val prope3 = fu1<Double?>(arrayOf(""))
    if (prope3.toString() != "(false, false)") {
println("""THEN""");
return "fail 5"
}

    val prope4 = fu1<Double?>(null)
    if (prope4.toString() != "(false, true)") {
println("""THEN""");
return "fail 6"
}

    // barNullable

    val prope5 = fu2<String>(arrayOf(""))
    if (prope5.toString() != "(true, true)") {
println("""THEN""");
return "fail 7"
}

    val prope6 = fu2<String>(null)
    if (prope6.toString() != "(true, true)") {
println("""THEN""");
return "fail 9"
}

    val prope7 = fu2<Double?>(arrayOf(""))
    if (prope7.toString() != "(false, false)") {
println("""THEN""");
return "fail 11"
}

    val prope8 = fu2<Double?>(null)
    if (prope8.toString() != "(true, true)") {
println("""THEN""");
return "fail 12"
}
    return "OK"
}

class Kla2 : Iterator<String> by ArrayList<String>().iterator()

class Kla3 : MutableIterator<String> by ArrayList<String>().iterator()

class Kla4 : ListIterator<String> by ArrayList<String>().listIterator()

class Kla5 : MutableListIterator<String> by ArrayList<String>().listIterator()

class Kla6 : Iterable<String> by ArrayList<String>()

class Kla7 : MutableIterable<String> by ArrayList<String>()

class Kla8 : Collection<String> by ArrayList<String>()

class Kla9 : MutableCollection<String> by ArrayList<String>()

class Kla10 : List<String> by ArrayList<String>()

class Kla11 : MutableList<String> by ArrayList<String>()

class Kla12 : Set<String> by HashSet<String>()

class Kla13 : MutableSet<String> by HashSet<String>()

class Kla14 : Map<String, String> by HashMap<String, String>()

class Kla15 : MutableMap<String, String> by HashMap<String, String>()

class Kla16 : Map.Entry<String, String> {
    override val key: String get() = throw UnsupportedOperationException()
    override val value: String get() = throw UnsupportedOperationException()
override fun toString(): String{
var res = ""
res += key.toString()
res += value.toString()
return res
}}

class Kla17 : MutableMap.MutableEntry<String, String> {
    override val key: String get() = throw UnsupportedOperationException()
    override val value: String get() = throw UnsupportedOperationException()
    override fun setValue(value: String): String = throw UnsupportedOperationException()
override fun toString(): String{
var res = ""
res += key.toString()
res += value.toString()
return res
}}

inline fun <reified Ty2> fu4(x: Any, operation: String) {
    try{
println("""TRY""");

        x as Ty2
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        throw AssertionError("$operation: should not throw exceptions, got $e")
}    
}

inline fun <reified Ty2> fu5(x: Any, operation: String) {
    try{
println("""TRY""");

        x as Ty2
}
    catch (e: ClassCastException){
println("""CATCH e: ClassCastException""");

        return
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        throw AssertionError("$operation: should throw ClassCastException, got $e")
}
    throw AssertionError("$operation: should fail with CCE, no exception thrown")
}

fun box154(): String {
    val prope9 = Kla2() as Any
    val prope10 = Kla3()

    fu5<MutableIterator<*>>(prope9, "reifiedAs<MutableIterator<*>>(itr)")
    fu4<MutableIterator<*>>(prope10, "reifiedAs<MutableIterator<*>>(mitr)")

    val prope11 = Kla4() as Any
    val prope12 = Kla5()

    fu5<MutableIterator<*>>(prope11, "reifiedAs<MutableIterator<*>>(litr)")
    fu5<MutableListIterator<*>>(prope11, "reifiedAs<MutableListIterator<*>>(litr)")
    fu4<MutableListIterator<*>>(prope12, "reifiedAs<MutableListIterator<*>>(mlitr)")

    val prope13 = Kla6() as Any
    val prope14 = Kla7()
    val prope15 = ArrayList<String>()

    fu5<MutableIterable<*>>(prope13, "reifiedAs<MutableIterable<*>>(it)")
    fu4<MutableIterable<*>>(prope14, "reifiedAs<MutableIterable<*>>(mit)")
    fu4<MutableIterable<*>>(prope15, "reifiedAs<MutableIterable<*>>(arrayList)")

    val prope16 = Kla8() as Any
    val prope17 = Kla9()

    fu5<MutableCollection<*>>(prope16, "reifiedAs<MutableCollection<*>>(coll)")
    fu5<MutableIterable<*>>(prope16, "reifiedAs<MutableIterable<*>>(coll)")
    fu4<MutableCollection<*>>(prope17, "reifiedAs<MutableCollection<*>>(mcoll)")
    fu4<MutableIterable<*>>(prope17, "reifiedAs<MutableIterable<*>>(mcoll)")
    fu4<MutableCollection<*>>(prope15, "reifiedAs<MutableCollection<*>>(arrayList)")

    val prope18 = Kla10() as Any
    val prope19 = Kla11()

    fu5<MutableList<*>>(prope18, "reifiedAs<MutableList<*>>(list)")
    fu5<MutableCollection<*>>(prope18, "reifiedAs<MutableCollection<*>>(list)")
    fu5<MutableIterable<*>>(prope18, "reifiedAs<MutableIterable<*>>(list)")
    fu4<MutableList<*>>(prope19, "reifiedAs<MutableList<*>>(mlist)")
    fu4<MutableCollection<*>>(prope19, "reifiedAs<MutableCollection<*>>(mlist)")
    fu4<MutableIterable<*>>(prope19, "reifiedAs<MutableIterable<*>>(mlist)")
    fu4<MutableList<*>>(prope15, "reifiedAs<MutableList<*>>(arrayList)")

    val prope20 = Kla12() as Any
    val prope21 = Kla13()
    val prope22 = HashSet<String>()

    fu5<MutableSet<*>>(prope20, "reifiedAs<MutableSet<*>>(set)")
    fu5<MutableCollection<*>>(prope20, "reifiedAs<MutableCollection<*>>(set)")
    fu5<MutableIterable<*>>(prope20, "reifiedAs<MutableIterable<*>>(set)")
    fu4<MutableSet<*>>(prope21, "reifiedAs<MutableSet<*>>(mset)")
    fu4<MutableCollection<*>>(prope21, "reifiedAs<MutableCollection<*>>(mset)")
    fu4<MutableIterable<*>>(prope21, "reifiedAs<MutableIterable<*>>(mset)")
    fu4<MutableSet<*>>(prope22, "reifiedAs<MutableSet<*>>(hashSet)")
    fu4<MutableCollection<*>>(prope22, "reifiedAs<MutableCollection<*>>(hashSet)")
    fu4<MutableIterable<*>>(prope22, "reifiedAs<MutableIterable<*>>(hashSet)")

    val prope23 = Kla14() as Any
    val prope24 = Kla15()
    val prope25 = HashMap<String, String>()

    fu5<MutableMap<*, *>>(prope23, "reifiedAs<MutableMap<*, *>>(map)")
    fu4<MutableMap<*, *>>(prope24, "reifiedAs<MutableMap<*, *>>(mmap)")
    fu4<MutableMap<*, *>>(prope25, "reifiedAs<MutableMap<*, *>>(hashMap)")

    val prope26 = Kla16() as Any
    val prope27 = Kla17()

    prope25[""] = ""
    val prope28 = prope25.entries.first()

    fu5<MutableMap.MutableEntry<*, *>>(prope26, "reifiedAs<MutableMap.MutableEntry<*, *>>(entry)")
    fu4<MutableMap.MutableEntry<*, *>>(prope27, "reifiedAs<MutableMap.MutableEntry<*, *>>(mentry)")
    fu4<MutableMap.MutableEntry<*, *>>(prope28, "reifiedAs<MutableMap.MutableEntry<*, *>>(hashMapEntry)")

    return "OK"
}


