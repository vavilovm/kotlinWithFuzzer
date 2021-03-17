// Different behavior happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun box(): String {
  val l: Long = 42
  val l2: (Long)? = 0
  val r = l!!.rangeTo(l)
  
val g = return if ((l2!!!!?.equals(1.let { it })) ?: (((null!! === Boolean.equals(5)!!))) && (r?.endInclusive!!) === r.start) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
if (((r?.endInclusive!!)!!!!?.equals(l)) ?: (l != null) && l2!! ?: r.start!! === l2.equals(null) ?: l2!!) "jhilo" else "OK"
}
when (g) {
 false -> {
println("""WHEN false""");
return "fail"
}
 else -> {
println("""WHEN """);
true
}
}

}