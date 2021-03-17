// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


interface Kla4<Ty1>
class Kla1
 : Kla4<
@Int String>

