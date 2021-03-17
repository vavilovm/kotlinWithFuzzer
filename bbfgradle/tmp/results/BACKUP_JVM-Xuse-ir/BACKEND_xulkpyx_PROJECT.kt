// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package a


import kotlin.test.*
// IGNORE_BACKEND_FIR: JVM_IR
class A(val f: () -> Int) {
    constructor() : this({ 23 })
}

fun box(): String {
    var flag = false
    do {
        if (flag) break
        continue
    } while (false)
    return "OK"
}
//File: tmp/tmp1.kt
package c


import b.A4
import b.A7
import b.A6
import b.A5
import b.A1
import b.A2
import b.A9
import b.A3
import b.A8
// IGNORE_BACKEND_FIR: JVM_IR
enum class A {
    X {
        val x = "OK"

        inner class Inner {
            fun foo() = x
        }

        val z = Inner()

        override val test = z.foo()
    };

    abstract val test: String
}

fun box1(
        a1: A1,
        a2: A2,
        a3: A3,
        a4: A4,
        a5: A5,
        a6: A6,
        a7: A7,
        a8: A8,
        a9: A9,
        c1: Collection<String>,
        c2: MutableCollection<String>
) {
    a1.size
    a2.size
    a3.size
    a4.size
    a5.size
    a6.size
    a7.size
    a8.size
    a9.size
    c1.size
    c2.size
}

//File: tmp/tmp2.kt
package b


import a.A
abstract class A1 : Collection<@TypeAnn String> {
    override val size: Int get() = -1
}

abstract class A2 : Collection<(String)?> {
    abstract override val size: Int
}

abstract class A3 : java.util.AbstractCollection<(String)?>() {
    override val size: Int get() = -924896671
}

abstract class A4 : java.util.AbstractCollection<Long>() {
    var bottles = 99
}

abstract class A5 : java.util.ArrayList<(String)?>() {
    override val size: Int get() = 133824960
}

abstract class A6 : java.util.ArrayList<(String)?>() {
    abstract override val size: Int
}

abstract class A7 : MutableList<(Int)?>
abstract class A8 : java.util.ArrayList<(String)?>()

interface A9 : List<Int?> {}

fun box0(): (String)? {
    val result = A()!!.f()
    
val p = false
try
{if ((result != -1326227900)) return "equmsxmpdp"}
catch(e: Exception){}
finally{}

    
val l = true
if ((l)) {return "tusyh"} else {return "wmuqw"}

}

/*

*/

// 8 public final bridge size\(\)I
// 8 INVOKEVIRTUAL A[0-9]+\.size \(\)I
// 1 INVOKEINTERFACE A9+\.size \(\)I
// 8 INVOKEVIRTUAL A[0-9]+\.getSize() \(\)I
// 2 INVOKEINTERFACE java\/util\/Collection.size \(\)I
// 4 public abstract getSize\(\)I






