// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Q {
  val s:Any = TODO()
}
enum class PropEnum(prop: Any
 ) {
    ELEM((Q::s)!!)
}
