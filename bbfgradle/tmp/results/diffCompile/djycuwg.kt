// Different compile happens on:JVM ,JVM -Xnew-inference

class Z(val data: Int) {
    override fun equals(other: Any?)  =
        other is Z &&
1 % 1 == other!!.data % 1
}
