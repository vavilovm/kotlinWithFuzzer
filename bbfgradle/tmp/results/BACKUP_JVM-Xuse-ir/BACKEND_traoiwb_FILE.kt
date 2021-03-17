// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Provider<T>(val _value: T
) {
operator fun provideDelegate(
thisRef: Any,kProperty: Any
) =
        Mut(_value)
}
class Mut<T>(var _value: T) {
operator fun getValue( thisRef: Any?,kProperty: Any
) = _value
}
fun box()  {
val topLevelDelegatedVarByProvider by Provider(1)
TODO()
topLevelDelegatedVarByProvider = 1
}