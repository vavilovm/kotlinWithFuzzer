// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

var backing = 1
inline class DelegateInt(val ignored: Int) {
fun setValue() {
var localD by DelegateLong()
}
}
class DelegateLong {
operator fun getValue( thisRef: Any?,prop: Any
) =
        backing
}
operator fun Any.setValue( thisRef: Any?,prop: Any,newValue: Int
):Int = TODO()
        