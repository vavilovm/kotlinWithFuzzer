// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

import kotlin.reflect.KProperty1
class Value<T>(var value: Int
 = null as Int
 )
val 
 Int.additionalValue by DVal(Value<KClass<*>>::value)
class DVal<T, R, P: KProperty1<T, R
>>(
 kmember: P)
