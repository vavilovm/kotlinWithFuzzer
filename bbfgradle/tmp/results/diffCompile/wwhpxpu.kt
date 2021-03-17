// Different compile happens on:JVM ,JVM -Xnew-inference
infix fun <R> Function0<R>.or(alt: R): R = TODO()
fun box(): String {
    return ({
        {}
    })!! or throw RuntimeException()
}