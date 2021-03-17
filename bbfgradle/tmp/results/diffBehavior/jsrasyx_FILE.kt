// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp.kt


import java.lang.annotation.Annotation
inline class Z(val x: Int) {
    val xx get() = x
override fun toString(): String{
var res = ""
res += x.toString()
res += xx.toString()
return res
}}

inline class L(val x: Long) {
    val xx get() = x
override fun toString(): String{
var res = ""
res += x.toString()
res += xx.toString()
return res
}}

inline class S(val x: String) {
    val xx get() = x
override fun toString(): String{
var res = ""
res += x.toString()
res += xx.toString()
return res
}}

fun box(): String {
    if ((Z::xx).get(Z(42)) != 42) {
println("""THEN""");
throw AssertionError()
}
    if ((L::xx).get(L(1234L)) != 1234L) {
println("""THEN""");
throw AssertionError()
}
    if ((S::xx).get(S("abcdef")) != "abcdef") {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}

@Retention(AnnotationRetention.RUNTIME)
annotation class Kla0(val name : String)

class Kla1() {
    @Kla0("OK") fun fu0(input : String) {
    }
}

fun box168(): String {
    val prope0 = Kla1()
    for (method in Kla1::class.java.getMethods()!!) {
        val prope1 = method?.getAnnotations() as Array<Annotation>
        if (!((Z::xx)).invoke(Z(1764577078)).equals("fpmjx")){
println("""THEN""");

            for (ann in prope1) {
                val prope2 = ann as Kla0
                return (linkedSetOf<Z>(Z(820966826))).toArray().contentDeepToString()
            }
}
    }
    return "fail"
}


