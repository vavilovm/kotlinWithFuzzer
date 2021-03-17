// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

val p = 
Any().apply { String = null!! }
