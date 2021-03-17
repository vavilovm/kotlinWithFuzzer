// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun box() 
 {
val ulongList = listOf( TODO(),1uL   )
    val ulongProgression = 1uL..1uL
val i = ulongProgression.iterator().next()
try {
{
        ulongList += i
    }
} catch(e: Exception){}
}
