// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt


fun box1(): Any {
val fu4 = 1
val prope1: List<Int.( Int,Int) -> Int> = listOf{ stroke,fill -> fu4 }
return "OK"
}
