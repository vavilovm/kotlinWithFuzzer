// EXECUTION DIFFERENT. Modified in 199.
// Original:
// OK
// 
// new:
// THEN
// fail ++b: 0
// 
// MODIFIED by Convert property getter to initializer intention:
// ORIGINAL CODE:
// // DONT_TARGET_EXACT_BACKEND: WASM
// // WASM_MUTE_REASON: PROPERTY_REFERENCES
// // Enable when KT-14833 is fixed.
// // IGNORE_BACKEND: JVM
// import kotlin.reflect.KProperty
// 
// public var a = 0
// 
// var b: Int
//     get() = a
//     set(v: Int) {
//         a = v
//     }
// 
// class A {
//     var c: Int
//         get() = a
//         set(v: Int) {
//             a = v
//         }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// var A.d: Int
//     get() = a
//     set(v: Int) {
//         a = v
//     }
// 
// var Int.e: Int
//     get() = a
//     set(v: Int) {
//         a = v
//     }
// 
// object SimpleDelegate {
//     operator fun getValue(thisRef: Any?, desc: KProperty<*>): Int {
//         return a
//     }
// 
//     operator fun setValue(thisRef: Any?, desc: KProperty<*>, value: Int) {
//         a = value
//     }
// }
// 
// var f by SimpleDelegate
// 
// fun box(): String {
//     if (b++ != 0) {
// println("""THEN""");
// return "fail b++: $b"
// }
//     if (++b != 2) {
// println("""THEN""");
// return "fail ++b: $b"
// }
//     if (--b != 1) {
// println("""THEN""");
// return "fail --b: $b"
// }
//     if (b-- != 1) {
// println("""THEN""");
// return "fail b--: $b"
// }
//     b += 10
//     if (b != 10) {
// println("""THEN""");
// return "fail b +=: $b"
// }
//     b *= 10
//     if (b != 100) {
// println("""THEN""");
// return "fail b *=: $b"
// }
//     b /= 5
//     if (b != 20) {
// println("""THEN""");
// return "fail b /=: $b"
// }
//     b -= 10
//     if (b != 10) {
// println("""THEN""");
// return "fail b -=: $b"
// }
//     b %= 7
//     if (b != 3) {
// println("""THEN""");
// return "fail b %=: $b"
// }
// 
//     var q = A()
// 
//     a = 0
//     if (q.c++ != 0) {
// println("""THEN""");
// return "fail q.c++: ${q.c}"
// }
//     if (++q.c != 2) {
// println("""THEN""");
// return "fail ++q.c: ${q.c}"
// }
//     if (--q.c != 1) {
// println("""THEN""");
// return "fail --q.c: ${q.c}"
// }
//     if (q.c-- != 1) {
// println("""THEN""");
// return "fail q.c--: ${q.c}"
// }
//     q.c += 10
//     if (q.c != 10) {
// println("""THEN""");
// return "fail q.c +=: ${q.c}"
// }
//     q.c *= 10
//     if (q.c != 100) {
// println("""THEN""");
// return "fail q.c *=: ${q.c}"
// }
//     q.c /= 5
//     if (q.c != 20) {
// println("""THEN""");
// return "fail q.c /=: ${q.c}"
// }
//     q.c -= 10
//     if (q.c != 10) {
// println("""THEN""");
// return "fail q.c -=: ${q.c}"
// }
//     q.c %= 7
//     if (q.c != 3) {
// println("""THEN""");
// return "fail q.c %=: ${q.c}"
// }
// 
//     a = 0
//     if (q.d++ != 0) {
// println("""THEN""");
// return "fail q.d++: ${q.d}"
// }
//     if (++q.d != 2) {
// println("""THEN""");
// return "fail ++q.d: ${q.d}"
// }
//     if (--q.d != 1) {
// println("""THEN""");
// return "fail --q.d: ${q.d}"
// }
//     if (q.d-- != 1) {
// println("""THEN""");
// return "fail q.d--: ${q.d}"
// }
//     q.d += 10
//     if (q.d != 10) {
// println("""THEN""");
// return "fail q.d +=: ${q.d}"
// }
//     q.d *= 10
//     if (q.d != 100) {
// println("""THEN""");
// return "fail q.d *=: ${q.d}"
// }
//     q.d /= 5
//     if (q.d != 20) {
// println("""THEN""");
// return "fail q.d /=: ${q.d}"
// }
//     q.d -= 10
//     if (q.d != 10) {
// println("""THEN""");
// return "fail q.d -=: ${q.d}"
// }
//     q.d %= 7
//     if (q.d != 3) {
// println("""THEN""");
// return "fail q.d %=: ${q.d}"
// }
// 
//     a = 0
//     if (0.e++ != 0) {
// println("""THEN""");
// return "fail 0.e++: ${0.e}"
// }
//     if (++0.e != 2) {
// println("""THEN""");
// return "fail ++0.e: ${0.e}"
// }
//     if (--0.e != 1) {
// println("""THEN""");
// return "fail --0.e: ${0.e}"
// }
//     if (0.e-- != 1) {
// println("""THEN""");
// return "fail 0.e--: ${0.e}"
// }
//     0.e += 10
//     if (0.e != 10) {
// println("""THEN""");
// return "fail 0.e +=: ${0.e}"
// }
//     0.e *= 10
//     if (0.e != 100) {
// println("""THEN""");
// return "fail 0.e *=: ${0.e}"
// }
//     0.e /= 5
//     if (0.e != 20) {
// println("""THEN""");
// return "fail 0.e /=: ${0.e}"
// }
//     0.e -= 10
//     if (0.e != 10) {
// println("""THEN""");
// return "fail 0.e -=: ${0.e}"
// }
//     0.e %= 7
//     if (0.e != 3) {
// println("""THEN""");
// return "fail 0.e %=: ${0.e}"
// }
// 
//     a = 0
//     if (f++ != 0) {
// println("""THEN""");
// return "fail f++: $f"
// }
//     if (++f != 2) {
// println("""THEN""");
// return "fail ++f: $f"
// }
//     if (--f != 1) {
// println("""THEN""");
// return "fail --f: $f"
// }
//     if (f-- != 1) {
// println("""THEN""");
// return "fail f--: $f"
// }
//     f += 10
//     if (f != 10) {
// println("""THEN""");
// return "fail f +=: $f"
// }
//     f *= 10
//     if (f != 100) {
// println("""THEN""");
// return "fail f *=: $f"
// }
//     f /= 5
//     if (f != 20) {
// println("""THEN""");
// return "fail f /=: $f"
// }
//     f -= 10
//     if (f != 10) {
// println("""THEN""");
// return "fail f -=: $f"
// }
//     f %= 7
//     if (f != 3) {
// println("""THEN""");
// return "fail f %=: $f"
// }
// 
// 
//     var g by SimpleDelegate
// 
//     a = 0
//     if (g++ != 0) {
// println("""THEN""");
// return "fail g++: $g"
// }
//     if (++g != 2) {
// println("""THEN""");
// return "fail ++g: $g"
// }
//     if (--g != 1) {
// println("""THEN""");
// return "fail --g: $g"
// }
//     if (g-- != 1) {
// println("""THEN""");
// return "fail g--: $g"
// }
//     g += 10
//     if (g != 10) {
// println("""THEN""");
// return "fail g +=: $g"
// }
//     g *= 10
//     if (g != 100) {
// println("""THEN""");
// return "fail g *=: $g"
// }
//     g /= 5
//     if (g != 20) {
// println("""THEN""");
// return "fail g /=: $g"
// }
//     g -= 10
//     if (g != 10) {
// println("""THEN""");
// return "fail g -=: $g"
// }
//     g %= 7
//     if (g != 3) {
// println("""THEN""");
// return "fail g %=: $g"
// }
// 
//     return "OK"
// }

// DONT_TARGET_EXACT_BACKEND: WASM
// WASM_MUTE_REASON: PROPERTY_REFERENCES
// Enable when KT-14833 is fixed.
// IGNORE_BACKEND: JVM
import kotlin.reflect.KProperty

public var a = 0

var b: Int=a
    set(v: Int) {
        a = v
    }

class A {
    var c: Int
        get() = a
        set(v: Int) {
            a = v
        }
override fun toString(): String{
var res = ""
return res
}}

var A.d: Int
    get() = a
    set(v: Int) {
        a = v
    }

var Int.e: Int
    get() = a
    set(v: Int) {
        a = v
    }

object SimpleDelegate {
    operator fun getValue(thisRef: Any?, desc: KProperty<*>): Int {
        return a
    }

    operator fun setValue(thisRef: Any?, desc: KProperty<*>, value: Int) {
        a = value
    }
}

var f by SimpleDelegate

fun box(): String {
    if (b++ != 0) {
println("""THEN""");
return "fail b++: $b"
}
    if (++b != 2) {
println("""THEN""");
return "fail ++b: $b"
}
    if (--b != 1) {
println("""THEN""");
return "fail --b: $b"
}
    if (b-- != 1) {
println("""THEN""");
return "fail b--: $b"
}
    b += 10
    if (b != 10) {
println("""THEN""");
return "fail b +=: $b"
}
    b *= 10
    if (b != 100) {
println("""THEN""");
return "fail b *=: $b"
}
    b /= 5
    if (b != 20) {
println("""THEN""");
return "fail b /=: $b"
}
    b -= 10
    if (b != 10) {
println("""THEN""");
return "fail b -=: $b"
}
    b %= 7
    if (b != 3) {
println("""THEN""");
return "fail b %=: $b"
}

    var q = A()

    a = 0
    if (q.c++ != 0) {
println("""THEN""");
return "fail q.c++: ${q.c}"
}
    if (++q.c != 2) {
println("""THEN""");
return "fail ++q.c: ${q.c}"
}
    if (--q.c != 1) {
println("""THEN""");
return "fail --q.c: ${q.c}"
}
    if (q.c-- != 1) {
println("""THEN""");
return "fail q.c--: ${q.c}"
}
    q.c += 10
    if (q.c != 10) {
println("""THEN""");
return "fail q.c +=: ${q.c}"
}
    q.c *= 10
    if (q.c != 100) {
println("""THEN""");
return "fail q.c *=: ${q.c}"
}
    q.c /= 5
    if (q.c != 20) {
println("""THEN""");
return "fail q.c /=: ${q.c}"
}
    q.c -= 10
    if (q.c != 10) {
println("""THEN""");
return "fail q.c -=: ${q.c}"
}
    q.c %= 7
    if (q.c != 3) {
println("""THEN""");
return "fail q.c %=: ${q.c}"
}

    a = 0
    if (q.d++ != 0) {
println("""THEN""");
return "fail q.d++: ${q.d}"
}
    if (++q.d != 2) {
println("""THEN""");
return "fail ++q.d: ${q.d}"
}
    if (--q.d != 1) {
println("""THEN""");
return "fail --q.d: ${q.d}"
}
    if (q.d-- != 1) {
println("""THEN""");
return "fail q.d--: ${q.d}"
}
    q.d += 10
    if (q.d != 10) {
println("""THEN""");
return "fail q.d +=: ${q.d}"
}
    q.d *= 10
    if (q.d != 100) {
println("""THEN""");
return "fail q.d *=: ${q.d}"
}
    q.d /= 5
    if (q.d != 20) {
println("""THEN""");
return "fail q.d /=: ${q.d}"
}
    q.d -= 10
    if (q.d != 10) {
println("""THEN""");
return "fail q.d -=: ${q.d}"
}
    q.d %= 7
    if (q.d != 3) {
println("""THEN""");
return "fail q.d %=: ${q.d}"
}

    a = 0
    if (0.e++ != 0) {
println("""THEN""");
return "fail 0.e++: ${0.e}"
}
    if (++0.e != 2) {
println("""THEN""");
return "fail ++0.e: ${0.e}"
}
    if (--0.e != 1) {
println("""THEN""");
return "fail --0.e: ${0.e}"
}
    if (0.e-- != 1) {
println("""THEN""");
return "fail 0.e--: ${0.e}"
}
    0.e += 10
    if (0.e != 10) {
println("""THEN""");
return "fail 0.e +=: ${0.e}"
}
    0.e *= 10
    if (0.e != 100) {
println("""THEN""");
return "fail 0.e *=: ${0.e}"
}
    0.e /= 5
    if (0.e != 20) {
println("""THEN""");
return "fail 0.e /=: ${0.e}"
}
    0.e -= 10
    if (0.e != 10) {
println("""THEN""");
return "fail 0.e -=: ${0.e}"
}
    0.e %= 7
    if (0.e != 3) {
println("""THEN""");
return "fail 0.e %=: ${0.e}"
}

    a = 0
    if (f++ != 0) {
println("""THEN""");
return "fail f++: $f"
}
    if (++f != 2) {
println("""THEN""");
return "fail ++f: $f"
}
    if (--f != 1) {
println("""THEN""");
return "fail --f: $f"
}
    if (f-- != 1) {
println("""THEN""");
return "fail f--: $f"
}
    f += 10
    if (f != 10) {
println("""THEN""");
return "fail f +=: $f"
}
    f *= 10
    if (f != 100) {
println("""THEN""");
return "fail f *=: $f"
}
    f /= 5
    if (f != 20) {
println("""THEN""");
return "fail f /=: $f"
}
    f -= 10
    if (f != 10) {
println("""THEN""");
return "fail f -=: $f"
}
    f %= 7
    if (f != 3) {
println("""THEN""");
return "fail f %=: $f"
}


    var g by SimpleDelegate

    a = 0
    if (g++ != 0) {
println("""THEN""");
return "fail g++: $g"
}
    if (++g != 2) {
println("""THEN""");
return "fail ++g: $g"
}
    if (--g != 1) {
println("""THEN""");
return "fail --g: $g"
}
    if (g-- != 1) {
println("""THEN""");
return "fail g--: $g"
}
    g += 10
    if (g != 10) {
println("""THEN""");
return "fail g +=: $g"
}
    g *= 10
    if (g != 100) {
println("""THEN""");
return "fail g *=: $g"
}
    g /= 5
    if (g != 20) {
println("""THEN""");
return "fail g /=: $g"
}
    g -= 10
    if (g != 10) {
println("""THEN""");
return "fail g -=: $g"
}
    g %= 7
    if (g != 3) {
println("""THEN""");
return "fail g %=: $g"
}

    return "OK"
}
