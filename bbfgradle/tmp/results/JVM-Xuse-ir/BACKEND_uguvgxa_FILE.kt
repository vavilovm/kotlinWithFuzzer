// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses, +UseGetterNameForPropertyAnnotationsMethodOnJvm
// FILE: tmp0.kt


interface IFoo {
    fun overridingFun()
    fun String.overridingExtFun()
val overridingVal: Int
    var overridingVar: Int
    val String.overridingExtVal: Int
    var String.overridingExtVar: Int
}
class Z(val x: Int
 ) : IFoo {
override fun overridingFun() = TODO()
override fun 
 String.overridingExtFun() = TODO()
override val overridingVal: Int
        get() = x
override var overridingVar: Int
        get() = x
        set(v) {}
override val 
 String.overridingExtVal: Int
        get() = x
override var 
 String.overridingExtVar: Int
        get() = x
        set(v) {}
fun @receiver:Int String.nonOverridingExtFun():Int = TODO()
}

