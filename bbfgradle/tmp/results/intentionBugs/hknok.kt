// PSI ERROR. Modified in 28
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  internal class Provider<T>(val _value: T) {
//     tailrec inline operator fun provideDelegate(thisRef: Any?, kProperty: Any) =
//         Mut(_value)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// class Mut<T>(var _value: T) {
// 
//     tailrec inline operator fun getValue(thisRef: Any?, kProperty: Any) = _value
// 
//     tailrec inline  operator fun setValue(thisRef: Any?, kProperty: Any, newValue: T) {
//         _value = newValue
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// class C {
//     val delegatedVal by Mut(1)
//     protected var delegatedVar by Mut(2)
// 
//     internal final val delegatedValByProvider by Provider(1)
//     var delegatedVarByProvider by Provider(2)
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// public val topLevelDelegatedVal by Mut(1)
// var topLevelDelegatedVar by Mut(2)
// 
// private val topLevelDelegatedValByProvider by Provider(1)
// private var topLevelDelegatedVarByProvider by Provider(2)
// 
// tailrec fun box(): String {
//     val localDelegatedVal by Mut(1)
//     var localDelegatedVar by Mut(2)
// 
//     val localDelegatedValByProvider by Provider(1)
//     var localDelegatedVarByProvider by Provider(2)
// 
//     if (localDelegatedVal != 1) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (localDelegatedVar != 2) {
// println("""THEN""");
// throw AssertionError()
// }
//     localDelegatedVar = 3
//     if (localDelegatedVar != 3) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     if (localDelegatedValByProvider != 1) {
// println("""THEN""");
// throw AssertionError()
// }
//     if (localDelegatedVarByProvider != 2) {
// println("""THEN""");
// throw AssertionError()
// }
//     localDelegatedVarByProvider = 3
//     if (localDelegatedVarByProvider != 3) {
// println("""THEN""");
// throw AssertionError()
// }
// 
//     return "OK"
// }
// 
// // 0 final static synthetic \[Lkotlin/reflect/KProperty; \$\$delegatedProperties
// // 0 kotlin/jvm/internal/PropertyReference0Impl\.\<init\>
// // 0 kotlin/jvm/internal/MutablePropertyReference0Impl\.\<init\>

 internal class Provider<T>( _value: T) {
    val _value = _valuetailrec inline operator fun provideDelegate(thisRef: Any?, kProperty: Any) =
        Mut(_value)
override fun toString(): String{
var res = ""
return res
}}

class Mut<T>(var _value: T) {

    tailrec inline operator fun getValue(thisRef: Any?, kProperty: Any) = _value

    tailrec inline  operator fun setValue(thisRef: Any?, kProperty: Any, newValue: T) {
        _value = newValue
    }
override fun toString(): String{
var res = ""
return res
}}

class C {
    val delegatedVal by Mut(1)
    protected var delegatedVar by Mut(2)

    internal final val delegatedValByProvider by Provider(1)
    var delegatedVarByProvider by Provider(2)
override fun toString(): String{
var res = ""
return res
}}

public val topLevelDelegatedVal by Mut(1)
var topLevelDelegatedVar by Mut(2)

private val topLevelDelegatedValByProvider by Provider(1)
private var topLevelDelegatedVarByProvider by Provider(2)

tailrec fun box(): String {
    val localDelegatedVal by Mut(1)
    var localDelegatedVar by Mut(2)

    val localDelegatedValByProvider by Provider(1)
    var localDelegatedVarByProvider by Provider(2)

    if (localDelegatedVal != 1) {
println("""THEN""");
throw AssertionError()
}
    if (localDelegatedVar != 2) {
println("""THEN""");
throw AssertionError()
}
    localDelegatedVar = 3
    if (localDelegatedVar != 3) {
println("""THEN""");
throw AssertionError()
}

    if (localDelegatedValByProvider != 1) {
println("""THEN""");
throw AssertionError()
}
    if (localDelegatedVarByProvider != 2) {
println("""THEN""");
throw AssertionError()
}
    localDelegatedVarByProvider = 3
    if (localDelegatedVarByProvider != 3) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}

// 0 final static synthetic \[Lkotlin/reflect/KProperty; \$\$delegatedProperties
// 0 kotlin/jvm/internal/PropertyReference0Impl\.\<init\>
// 0 kotlin/jvm/internal/MutablePropertyReference0Impl\.\<init\>
