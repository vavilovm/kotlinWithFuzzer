// Different compile happens on:JVM ,JVM -Xnew-inference

fun box(): String {
var aFloat: Float
var bFloat: Float = TODO()
if (aFloat != null) throw AssertionError()
if (aFloat != bFloat) return ""
aFloat+
    bFloat++
}
