// Different compile happens on:JVM ,JVM -Xnew-inference

class Outer<X>(val x: X) {
    inner class Inner<Y>(val y: Y) {
override fun equals(other: Any?)  =
            other is Outer<*>.Inner<*> &&
                    other.run {} == x &&
                    other!!.y == y
    }
}
