package inline

inline fun Inline.set(receiver: Any?, prop: PropertyMetadata, value: Int) {
    println(value)
}