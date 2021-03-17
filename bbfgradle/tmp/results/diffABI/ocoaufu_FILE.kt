// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

var global = "wrong"

inline class Foo(val x: Int) {
    constructor(y: String) : this(y.length)

    constructor(z: Long) : this(z.toInt() + 1)

    @Suppress("SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_INLINE_CLASS")
    constructor(other: Char) : this(other.toInt().toString()) {
        global = "OK"
    }

    constructor(a: Int, b: Int) : this(a + b)
}

fun box(): String =TODO()

internal sealed class A<T: Foo> (val a: Foo, val b: Char, val c: T, val d: Foo, val e: ArrayList<Int>): Function <Foo>{

inline  private fun  yxbtf(a: Foo, b: Foo, c: Foo, d: Pair<UByte, Array<UByte>>): Foo = TODO()

inline   fun  yfkxa(a: Foo, b: Long, c: HashMap<UShort, Foo>, d: Byte): Float = TODO()

inline suspend  fun   Foo.pwwhf(a: Float, b: UShort, c: LinkedHashSet<UInt>, d: HashSet<ULong>): ArrayDeque<UByte> = TODO()

infix private fun   HashSet<Set<Foo>>.oejwe(a: ULong): Short = TODO()

inline tailrec public fun <T: HashSet<String>>  ehowr(a: T, b: Float): ArrayDeque<UShort> = TODO()

}


