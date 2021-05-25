// COMPILE != OK. Modified in 73
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // JVM_TARGET: 1.8
// interface KCallable {
//     val returnType: String
// }
// 
// abstract interface KCallableImpl : KCallable {
//     override val returnType: String
//         get() = "OK"
// }
// 
// interface KProperty : KCallable
// interface KPropertyImpl : KProperty, KCallableImpl
// interface KMutableProperty : KProperty
// interface KProperty1 : KProperty
// interface KMutableProperty1 : KProperty1, KMutableProperty
// interface KMutablePropertyImpl : KPropertyImpl
// 
// open class DescriptorBasedProperty : KCallableImpl
// open class KProperty1Impl : DescriptorBasedProperty(), KProperty1, KPropertyImpl
// open class KMutableProperty1Impl : KProperty1Impl(), KMutableProperty1, KMutablePropertyImpl
// 
// fun box(): String {
//     return KMutableProperty1Impl().returnType
// }

// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
interface KCallable {
    fun getReturnType(): String
}

abstract interface KCallableImpl : KCallable {
    override fun getReturnType(): String = "OK"
}

interface KProperty : KCallable
interface KPropertyImpl : KProperty, KCallableImpl
interface KMutableProperty : KProperty
interface KProperty1 : KProperty
interface KMutableProperty1 : KProperty1, KMutableProperty
interface KMutablePropertyImpl : KPropertyImpl

open class DescriptorBasedProperty : KCallableImpl
open class KProperty1Impl : DescriptorBasedProperty(), KProperty1, KPropertyImpl
open class KMutableProperty1Impl : KProperty1Impl(), KMutableProperty1, KMutablePropertyImpl

fun box(): String {
    return KMutableProperty1Impl().returnType
}
