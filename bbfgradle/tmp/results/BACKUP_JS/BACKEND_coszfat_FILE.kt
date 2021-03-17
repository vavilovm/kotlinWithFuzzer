// Bug happens on JS 
// FILE: tmp0.kt

fun box()  {
    val shouldBeTrue = 1L in 1 downTo 1
    !shouldBeTrue
}
