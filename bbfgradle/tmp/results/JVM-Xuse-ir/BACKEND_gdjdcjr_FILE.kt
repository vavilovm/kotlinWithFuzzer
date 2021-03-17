// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


fun isImportedByDefault(x: Set<Int> ) = Char.MAX_VALUE in x

