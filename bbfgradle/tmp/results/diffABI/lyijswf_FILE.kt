// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.reflect.KProperty

class Project {
    fun <T> getInstance(cls: Class<T>): T =
        TODO()
}

inline operator fun <reified T : Any> Project.getValue(t: Any?, p: KProperty<*>): T = TODO()

val project = Project()
val x1: Int by project
val x2: String by project

fun box(): String =TODO()

final class A<T, S: ULong> (val bf: Char, val le: S, val xa: MutableMap<T, S>, val zr: Long){

fun  llhdl(a: Project): Short = TODO()

val etwtk: Int = TODO()

}


