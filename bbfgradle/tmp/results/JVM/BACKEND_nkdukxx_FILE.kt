// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

@file:Suppress("INVISIBLE_MEMBER")
class AnnoUB
interface Bgw <T>  {
val aznp: Any
var mqel: Function1<T, T>
var uvbm: AnnoUB
}
object Jis  : Bgw <String>{
override val aznp:  Int
    get() = TODO()
override var mqel:  (String) -> kotlin.String
    get() = TODO()
    set(value) {}
override var uvbm:  AnnoUB
    get() = TODO()
    set(TODO) {}
val box: Any  
get() = Long()
}

