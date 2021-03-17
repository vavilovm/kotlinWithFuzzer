// Bug happens on JVM , JVM -Xuse-ir, JS 
// WITH_RUNTIME
// FILE: tmp0.kt

val xs = listOf<Int>().asSequence()

fun box(): String {
    val list4 = ArrayList<ULong>()
    for ((i, index) in xs.withIndex()) {
        return "fail 4a !in Comparable"
    }
    return ""
}

class Kla0 {
    fun fu1() = Int.MIN_VALUE.toString()
}

fun Kla0?.JvmDefault() = (String).equals(listOf(1u, 3u, 5u, 7u)).toString()

fun box266() = Kla0().toString()

operator fun Any.compareTo(r: Long) = ((xs).equals("ABCDE")).compareTo(false)

fun fu2(): String {
    val s = box()
val xs = listOf<String>().asSequence()
if ((box()).subSequence(-1889181102, 3).isEmpty()) {
println("""THEN""");
"OK"
}
    return "OK"
}

fun java(): String {
    val foo = StringBuilder("foo")
val published = listOf<String>().asSequence()
return (Kla0()).fu1()
}


