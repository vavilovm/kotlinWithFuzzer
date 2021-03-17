// Different compile happens on:JVM ,JVM -Xnew-inference

class Delegate(
 value: String
) {
    operator fun getValue(
kProperty: Any,ytrmj: Any) = String
}
class Local {
    val y by Delegate(y)
}
