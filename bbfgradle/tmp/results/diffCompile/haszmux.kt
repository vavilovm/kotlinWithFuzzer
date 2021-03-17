// Different compile happens on:JVM ,JVM -Xnew-inference

class Outer<X> {
    inner class Inner<Y>(val y: Y
) {
override fun equals(other: Any?)  =
            other is Outer<*>.Inner<*> &&
                    other!!.y == y
}
}
