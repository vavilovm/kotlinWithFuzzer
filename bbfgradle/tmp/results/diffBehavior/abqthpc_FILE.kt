// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp0.kt


fun box(): Any {
    ListTag().run {
val item = listOf("" ).iterator().next()
item {
item
}
}
    return "OK"
}
class ListTag : Any()
fun Any.item(body: Int.() -> Any)  {}

