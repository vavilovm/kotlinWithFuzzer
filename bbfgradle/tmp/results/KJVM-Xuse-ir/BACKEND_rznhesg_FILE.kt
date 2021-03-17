// Bug happens on KJVM -Xuse-ir
//File: tmp/tmp0.kt

var A?.bar: Int
    get() = 1
    set(value) {}
fun box1()  =
        when {
Any()?.equals(TODO()) ?: (null::bar) -> ""
else -> ""
        }
class A
