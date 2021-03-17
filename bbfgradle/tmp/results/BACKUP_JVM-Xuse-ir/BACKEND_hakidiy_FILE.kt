// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

typealias CT<T> = Class<*>
class C1 : CT<Int>
