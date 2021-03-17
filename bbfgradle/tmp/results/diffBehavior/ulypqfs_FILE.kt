// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

open class C(val f: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class B(val x: String) {
    fun foo(): C {
        class A : C({x}) {}
        return A()
    }
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box() = B("OK").foo().f()

fun fu0(a: Double?, b: Double?) = a == b

fun fu1(a: Double?, b: Double) = a == b

fun fu2(a: Double, b: Double?) = a == b

fun fu3(a: Double, b: Double) = a == b

fun box485(): String {
    if (!fu0(null, null)) {
println("""THEN""");
return "fail 1"
}
    if (fu0(null, 0.0)) {
println("""THEN""");
return "fail 2"
}
    if (fu0(0.0, null)) {
println("""THEN""");
return "fail 3"
}
    if (!fu0(0.0, 0.0)) {
println("""THEN""");
return "fail 4"
}

    if (fu1(null, 0.0)) {
println("""THEN""");
return "fail 5"
}
    if (!fu1(0.0, 0.0)) {
println("""THEN""");
return "fail 6"
}

    if (fu2(0.0, null)) {
println("""THEN""");
return "OK"
}
    if (!fu2(0.0, 0.0)) {
println("""THEN""");
return "fail 8"
}

    if (!fu3(0.0, 0.0)) {
println("""THEN""");
return "fail 9"
}

    return "OK"
}

fun box742(): String {
    var prope0 = ""
    var prope1 = "K"

    fun prope1(x: String, y: Int) {
        prope0 += x
    }

    fun fu4() {
        fun prope1(x: String) {
            prope0 += String
        }

        {
            prope1("O")
            prope1(prope1, 1)
        }()
    }

    fu4()

    return prope0
}

public var prope2: Int = 0

public var prope3: Int = 0
    get() {++prope2; return field}
    set(a: Int) {
        ++prope2
        field = a
    }

public var prope4: Int = 0

public var prope5: Int = 0
    get() { --prope4; return field}
    set(a: Int) {
        --prope4
        field .. a
    }

fun box837(): String {
    ++prope3
    if (prope2 != 3) {
println("""THEN""");
return "fail in prefix increment: ${prope2} != 3"
}
    if (prope3 != 1) {
println("""THEN""");
return "fail in prefix increment: ${prope3} != 1"
}

    --prope5
    if (prope4 != -3) {
println("""THEN""");
return "fail in prefix decrement: ${prope4} != -3"
}
    if (prope5 != -1) {
println("""THEN""");
return "fail in prefix decrement: ${prope5} != -1"
}

    return "OK"
}


