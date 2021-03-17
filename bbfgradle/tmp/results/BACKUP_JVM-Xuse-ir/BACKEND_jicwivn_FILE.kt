// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun decodeValue()  {
     when ('⑇') {
'I' -> String!!::toInt
}
}
