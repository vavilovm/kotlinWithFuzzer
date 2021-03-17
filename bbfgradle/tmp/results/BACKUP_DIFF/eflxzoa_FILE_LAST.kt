// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any
 {
    1?.toByte()?.hashCode()
return "OK"
}