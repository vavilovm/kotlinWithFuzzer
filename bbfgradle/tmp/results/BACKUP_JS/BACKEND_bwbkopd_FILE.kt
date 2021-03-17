// Bug happens on JS 
// FILE: tmp0.kt

fun decodeValue(value: String)  {
when (value[1]) {
'I' -> value.substring(1)::toInt
}
}

