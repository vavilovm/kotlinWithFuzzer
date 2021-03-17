// Bug happens on JVM 
//File: tmp/tmp0.kt

class Provider<T>(
 _value: T) {
    inline operator fun provideDelegate(
thisRef: Any,kProperty: Any
) =
        Mut(TODO())
}
class Mut<T>(var _value: T) {
inline operator fun getValue( thisRef: Any?,kProperty: Any
) = _value
inline 
 fun setValue() {
val topLevelDelegatedValByProvider by Provider(TODO())
}
}
