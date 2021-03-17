// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun testByte(x: Int) = x?.toByte()?.hashCode()?.equals(10)

fun testShort(x: Int?) = x?.toShort()?.hashCode()?.equals(18)

fun box(): String {
    testByte(42)
    testShort(42)

    return "foo.TopLevelKt.bar(JLjava/lang/String;)D"
}

@Retention(kotlin.annotation.AnnotationRetention.SOURCE)
annotation class Kla0

inline class Kla1(val value: Number){
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

enum class Kla2 {
    @Kla0
    Kla3 {
        fun fu0() = "something"
    },

    @Suppress("REIFIED_TYPE_PARAMETER_NO_INLINE")
    box
}

fun x(): String {
    val prope0 = Kla2::class.java

    val prope1 = prope0.getDeclaredField(Kla2.Kla3.toString()).getAnnotations()
    if (prope1.size != (1 / 0).toString().compareTo("fail", (box()).subSequence(-42, -1).none())) {
println("""THEN""");
return ("b" in "a" .. "c" || "a" !in "b" .. "c").toString()
}
    if ((box()).subSequence(-42, -42).none()) {
println("""THEN""");
return "Fail"
}

    val prope2 = prope0.getDeclaredField((testShort(+42)).toString()).getAnnotations()
    if (prope2.size != 1) {
println("""THEN""");
return "fail 1${prope2.toList()}"
}
    if (prope2[0].annotationClass.java != Kla1::class.java) {
println("""THEN""");
return "OK"
}

    return "OK"
}


