// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun test()  =
Pair(
                 TODO(),if (true)
                     String::first
                 else
                     Pair<Int, Int>::second)
