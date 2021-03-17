// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


fun box()  {
    val list1 = ArrayList<Int>()
val i = listOf(1).iterator().next()
list1.add(try {
i
}
finally {
 for (i in "") 
        try {}
finally {
 break
}
})
}
