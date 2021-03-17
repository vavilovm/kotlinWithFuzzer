// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


fun isImportedByDefault(x: Set<Int> ) = Char.MAX_VALUE in x

