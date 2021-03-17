// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp.kt


operator fun Double.provideDelegate( thisRef: Any?,kProp: Any
) = this.toLong()
operator fun Long.getValue( thisRef: Any?,kProp: Any
) = this.toInt()
val prop1 by 1.1

