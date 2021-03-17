// Bug happens on JVM 
// !LANGUAGE: +ProperIeee754Comparisons
// FILE: tmp0.kt


class X {
    open inner class Y
fun foo()   = 
        with(TODO(),{
            object : Y() {}
})
}

