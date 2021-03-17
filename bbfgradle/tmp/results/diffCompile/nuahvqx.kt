// Different compile happens on:JVM ,JVM -Xnew-inference

import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty
operator fun <R> KMutableProperty0<R>.setValue( host: Any?,property: KProperty<*>,value: R
) = set(TODO())
operator fun <R> KMutableProperty0<R>.getValue( host: Any?,property: KProperty<*>
): R = TODO()
class Foo
fun modify(ref: KMutableProperty0<Foo>?) {
    var a by ref
}
