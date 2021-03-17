fun <T> sa(a: T, b: List<T>): String {
    return "$a $b"
}

class A<T, R>(val a: T, val b: T, val c: R) {
    fun a(a: T): T = a
    fun b(b: R) = "$b"
    inner class B(val a: R, val b: T, val d: R = c) {
        fun a(a: T, b: R) = b
    }

    class C<T>(val a: T) {
        val abcd = a
        fun lol123(a: A<T, Int>, b: Int) = b
    }
}


fun box(): String {
    val bc = A<Int, String>(1, 2, "").B("", 1)
    val a = sa(1, listOf(1, 2, 3))
    val b = A<Int, String>(1, 2, "a")
    val c = 12345
    val d = "abcd"
    val e = listOf(1)
    return "$a ${b.a(1)} ${b.b} ${b.b("123")} $c $d $e"
}
