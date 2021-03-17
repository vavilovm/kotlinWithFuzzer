//Duplicate of /home/stepanov/Kotlin/bbfgradle/tmp/results/JVM-Xnew-inference/sraoo.kt

object Map1 {
    operator fun get(
i: Int,j: Int
) = Map2
}
object Map2 {
    operator fun get( i: Int?,j: Int) = 1
    operator fun set( i: Int,j: Int,newValue: Int ):Unit = TODO()
}
fun box()  {
    Map1[1, 1][1, 1]++
}