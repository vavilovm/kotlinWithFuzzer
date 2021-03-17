// Bug happens on KJVM -Xuse-ir
// FILE: Fn.java
 interface Fn<T, R> {
    R run(String A, int var0, T FunctionReference);
}


// FILE: 1.kt
fun box()  {
    val j = J()
val r1 = j.runConversion( { s,i,ts -> 
 },TODO())
}
// FILE: J.java

 class J {
    
 int runConversion(Fn<String, void> f1, Fn
 f2) {
        

    }
}

