// Bug happens on JVM 
// FILE: tmp0.kt


var prope1 = 1
class Kla0 {
operator fun getValue( thisRef: Int?,prop: Any
) =
        prope1
operator fun setValue( bar: Any?,prop: Any,newValue: Int
):Int = TODO()
}
fun fu1() {
    var prope2 by Kla0()
prope2++
}

