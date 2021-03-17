// Bug happens on JVM 
//File: tmp/tmp0.kt

class Provider
 {
operator fun provideDelegate() =
        Mut()
}
class Mut
{
fun getValue() = topLevelDelegatedVarByProvider
}
val topLevelDelegatedValByProvider by Provider()
var topLevelDelegatedVarByProvider by Provider()
