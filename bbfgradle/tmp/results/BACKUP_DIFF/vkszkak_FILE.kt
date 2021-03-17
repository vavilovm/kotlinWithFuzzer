// Bug happens on JVM , JS 
// FILE: tmp0.kt

fun box(): String {
    val testArray: Array<String?>? = when (0) {
        1 -> {
println("""WHEN 1""");
null
}
        else -> {
println("""WHEN """);
arrayOfNulls<String>(0.unaryMinus())
}
    }


    // IGNORE_BACKEND_FIR: JVM_IR
    val anra = listOf(1u, 6u, 3u)
val size = testArray?.size

    
val g:String = return Float?.toString() ?: "Fail: '"
when (false) {
 return size?.toString() ?: "Fail: " -> {
println("""WHEN return size?.toString() ?: Fail: """);
g
}
 else -> {
println("""WHEN """);
false
}
}


}
var add:Int = 32768
