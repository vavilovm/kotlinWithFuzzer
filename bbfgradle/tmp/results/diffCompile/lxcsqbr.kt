// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun box(): String {
val p:Any = TODO()
when (p) {
 null -> ""
 else ->
return ""
}
val list1 = ArrayList<Char>(null)
}
