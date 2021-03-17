// Bug happens on JVM -Xuse-ir
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
