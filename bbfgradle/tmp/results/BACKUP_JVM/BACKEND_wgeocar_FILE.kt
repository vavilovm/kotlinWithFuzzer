// Bug happens on JVM 
//File: tmp/tmp0.kt

enum class Game {
;
companion object {
val values2 = values()
}
}
fun box()  {
val z:Any = TODO()
Game.values2.size++
}
