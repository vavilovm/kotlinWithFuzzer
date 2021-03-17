// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Mut<T>(var _value: T) {
operator fun getValue( thisRef: Any?,kProperty: Any
) = _value
}
val result = ""
fun box()  {
val localDelegatedVal by Mut(TODO())
result += ""
}
