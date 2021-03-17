// Bug happens on JVM 
//File: tmp/tmp0.kt

operator fun Double.provideDelegate(
thisRef: Any,kProp: Any
) = this.toLong()
operator fun Long.getValue( thisRef: Any?,kProp: Any
) = this.toInt()
val magic1 by 1.1
