// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.Sign.plus
import a.Sign
import a.Sign.mult
class A {
    fun foo() = "OK"
}

fun A?.bar() = if (this != null) foo() else "FAIL"

fun box0(): String {
    val sum = Sign.plus.func(2, 3)
    if (sum != 5) return "Fail 1: $sum"

    val product = Sign.mult.toString()
    if (product != "20") return "Fail 2: $product"

    return "OK"
}

//File: tmp/tmp1.kt
package c


import b.A
import b.bar


public interface FunDependencyEdge {
    val from: FunctionNode
}

public interface FunctionNode

public class FunctionNodeImpl : FunctionNode

class FunDependencyEdgeImpl(override val from: FunctionNodeImpl): FunDependencyEdge {
}

fun box1() = A().bar()

//File: tmp/tmp2.kt
package a


import c.FunDependencyEdge
import c.FunctionNode
import c.FunDependencyEdgeImpl
import c.FunctionNodeImpl
// KT-4423 Enum with function not compiled

enum class Sign(val str: (String)?, val func: (x: Int, y: Int) -> (Int)?){
    plus("+", { x, y -> x + y }!!),

    mult("*", { x, y -> x * y }) {
        override fun toString() = "${func(4,5)}"
    }
}

fun box2(): (String)? {
    (FunDependencyEdgeImpl(FunctionNodeImpl()) as FunDependencyEdge).from
    return "OK"!!
}
