// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt


open class Kla1<Ty2> {
    fun fu1(x: Ty2) = ""
    fun fu1(y: String) = ""
}
class Kla2 : Kla1<String>()

