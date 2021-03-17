// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun box()  {
val n:Any 
 TODO()
when (n) {
 true -> {{{}
    }}
 else -> {{true
    }}
}
}
