// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt


val prope1 = {}
fun box1(): Any {
"ebxgp".indexOfAny( CharArray(437369809),"".indexOfAny( CharArray(1)
),true )
    return "OK"
}
