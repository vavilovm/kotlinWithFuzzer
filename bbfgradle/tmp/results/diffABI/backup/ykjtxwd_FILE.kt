// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class S(val string: String)

sealed class Sealed(val x: S)

class Test(x: S) : Sealed(x)

fun box():String = TODO()

data private  class A<T, S: UByte> (val sw: Short, val yt: S){

val sgsni: HashSet<S> = TODO()

}


