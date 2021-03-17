// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt


import kotlin.reflect.typeOf
class Container<T>
fun <X, Y, Z> test() where X : Y?, Y : (List<*>)?, Z : Int
        = typeOf<(Container<X>)?>()

