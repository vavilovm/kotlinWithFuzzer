// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box()  {
when (true) {
  {}!!!!!! -> ArrayList::class.members
}
}
