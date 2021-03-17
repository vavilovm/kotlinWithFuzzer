// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt


fun box() = if (("bivnn")?.equals("a12") ?: ("$" === "fail")) {
println("""THEN""");
"a12"(12)
} else {
println("""ELSE""");
null!!
}
//KT-3631 String.invoke doesn't work with literals
operator fun String.invoke(i: Int) = "thiscrefh$i"!!