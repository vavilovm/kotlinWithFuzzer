// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt

interface KCallable {
    @Suppress
    val returnType: String
}
interface KCallableImpl : KCallable {
    @JvmDefault
    override val returnType: String
        get() = ""
}
interface KProperty : KCallable
interface KPropertyImpl : KProperty, KCallableImpl
interface KMutableProperty : KProperty
interface KProperty1 : KProperty
interface KMutableProperty1 : KProperty1, KMutableProperty
interface KMutablePropertyImpl : KPropertyImpl
open class DescriptorBasedProperty : KCallableImpl
open class KProperty1Impl : Any(), KProperty1, KPropertyImpl
open class KMutableProperty1Impl : Any(), KMutableProperty1, KMutablePropertyImpl

