// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.*
import kotlin.test.assertEquals
import kotlin.collections.Map
import kotlin.Annotation


class C(val x: Int, var y: Int)

val C.xx: Int
    get() = x

var C.yy: Int
    get() = y
    set(value) { y = value }


val c = C(1, 2)

val c_xx = c::xx
val c_y = c::y
val c_yy = c::yy

fun box(): String =TODO()

internal abstract class A<T> (val wm: C = C(-1448088806, -318596246), val bq: T): Map <UInt, C>, Annotation{

val pnyoh: UShort = TODO()

}


