// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class CustomDelegate {
    operator fun getValue( String: String?,prop: Any): Int = TODO()
}
@delegate:HashSet<Int> val del: Any by CustomDelegate()
