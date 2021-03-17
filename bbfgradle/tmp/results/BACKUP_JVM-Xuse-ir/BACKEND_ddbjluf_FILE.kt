// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any {
    val prop: Int by Delegate()
return ""
prop++
}
class Delegate {
    operator fun getValue( t: Any?,xwejs: Any): Int = TODO()
}
