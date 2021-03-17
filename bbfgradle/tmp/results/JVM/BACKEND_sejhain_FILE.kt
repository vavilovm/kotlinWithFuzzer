// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.reflect.typeOf
@OptIn(kotlin.ExperimentalStdlibApi::class)
inline fun <reified T> T.causeBug()  = 
    typeOf<T>()
interface SomeToImplement<SELF_TVAR>
class Something<T> where T: SomeToImplement<T> {
    fun op() = causeBug()
}

