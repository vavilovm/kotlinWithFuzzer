// Different compile happens on:JVM ,JVM -Xnew-inference

class DelegateLong
 {
operator fun setValue(
box: String,prop: Any,newValue: Int
):Unit = TODO()
}
fun box()  {
null!!
var localD by DelegateLong()
}
operator  fun DelegateLong.getValue( a: Any,prop: Any
) = 1
