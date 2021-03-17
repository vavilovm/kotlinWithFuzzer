// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun box()   {
if( 1.hashCode() != intArrayOf() as Any) ""
}
