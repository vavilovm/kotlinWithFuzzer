// Different compile happens on:JVM ,JVM -Xnew-inference

val capturedInConstructor = 1
class A(
 x: Int) {
init {
            String == x ?: capturedInConstructor
        }
    }
