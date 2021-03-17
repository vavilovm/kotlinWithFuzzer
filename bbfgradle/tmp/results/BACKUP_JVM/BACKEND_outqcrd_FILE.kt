// Bug happens on JVM 
//File: tmp/tmp0.kt

fun test()  =
Pair(
                 TODO(),if (true)
                     String::first
                 else
                     Pair<Int, Int>::second)
