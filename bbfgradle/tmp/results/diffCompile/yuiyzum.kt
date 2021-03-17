// Different compile happens on:JVM ,JVM -Xnew-inference

enum class Sign(
 str: String
, 
 func: (x: Int, y: Int) -> Int
){
    plus(""
, { x, y -> 1
}!!)
}
