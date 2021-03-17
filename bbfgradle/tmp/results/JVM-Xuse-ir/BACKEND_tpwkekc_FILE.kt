// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


fun isImportedByDefault(
c: Int,x: Set<Int>) = c?.let {} in x

