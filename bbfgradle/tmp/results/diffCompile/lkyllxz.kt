// Different compile happens on:JVM ,JVM -Xnew-inference

 fun <
 T> jaggedArray(x: (Int, Int, Int) -> T): Array<Array<Array<T>>> = TODO()

val x1: Array<Array<Array<Array<String
>>>> = jaggedArray{ x, y, z -> 
 }
