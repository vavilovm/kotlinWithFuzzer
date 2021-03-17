// Different compile happens on:JVM ,JVM -Xnew-inference

fun <T: ArrayList<List<Map<Int,Array<ArrayList<ArrayList<Map<ArrayList<HashMap<T,Double>>,Array<Map<T,Int>>>>>>>>>
> foo(t: Float
):Unit = TODO()
fun <T: Number
> foo(t: Number
):Unit = TODO()
fun box()  {
    foo<Byte
>(TODO())
}
