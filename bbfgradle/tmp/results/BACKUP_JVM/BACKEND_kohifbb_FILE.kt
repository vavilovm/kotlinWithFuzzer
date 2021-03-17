// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp.kt


 fun 
 Int.stopAfter(): Iterator<Int> = iterator {
do {
        {}
    }
    while (true)
}

