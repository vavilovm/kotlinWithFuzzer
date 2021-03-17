// Different compile happens on:JVM ,JVM -Xnew-inference

var backing = 1
class Delegate(
 ignored: Int) {
operator fun getValue( thisRef: Any?,prop: Any
) =
        backing
operator fun setValue( thisRef: Any?,prop: Any,newValue: Int
):Unit = TODO()
}
var topLevelD by Delegate(topLevelD)
