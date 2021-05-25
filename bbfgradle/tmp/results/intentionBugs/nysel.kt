// EXECUTION FAILED AFTER INTENTION pos 990
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_RUNTIME
// 
// import kotlin.reflect.*
// 
// object Host {
//     open var none: Int = 0
//         get() = field
//         set(value) { field = value }
//     
//     public final var get: Int = 0
//         @JvmStatic
//         get() = field
//         set(value) { field = value }
//     
//     public var set: Int = 0
//         get() = field
//         @JvmStatic
//         set(value) { field = value }
// 
//     public var both: Int = 0
//         @JvmStatic
//         get() = field
//         @JvmStatic
//         set(value) { field = value }
// 
//     @JvmStatic    
//     open var property: Int = 0
//         get() = field
//         set(value) { field = value }
// }
// 
// tailrec fun box(): String {
//     val none = Host::none as KMutableProperty0<Int>
//     none.set(1)
//     if (none.get() != 1) {
// println("""THEN""");
// return "Fail none: ${none.get()}"
// }
//     
//     val get = Host::get as KMutableProperty0<Int>
//     get.set(1)
//     if (get.get() != 1) {
// println("""THEN""");
// return "Fail get: ${get.get()}"
// }
//     
//     val set = Host::set as KMutableProperty0<Int>
//     set.set(1)
//     if (set.get() != 1) {
// println("""THEN""");
// return "Fail set: ${set.get()}"
// }
// 
//     val both = Host::both as KMutableProperty0<Int>
//     both.set(1)
//     if (both.get() != 1) {
// println("""THEN""");
// return "Fail both: ${both.get()}"
// }
// 
//     val property = Host::property as KMutableProperty0<Int>
//     property.set(1)
//     if (property.get() != 1) {
// println("""THEN""");
// return "Fail property: ${property.get()}"
// }
//     
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_RUNTIME

import kotlin.reflect.*

object Host {
    open var none: Int = 0
        get() = field
        set(value) { field = value }
    
    public final var get: Int = 0
        @JvmStatic
        get() = field
        set(value) { field = value }
    
    public var set: Int = 0
        get() = field
        @JvmStatic
        set(value) { field = value }

    public var both: Int = 0
        @JvmStatic
        get() = field
        @JvmStatic
        set(value) { field = value }

    @JvmStatic    
    open var property: Int = 0
        get() = field
        set(value) { field = value }
}

tailrec fun box(): String {
    val none = Host::none as KMutableProperty0<Int>
    none.set(1)
    if (none.get() != 1) {
println("""THEN""");
return "Fail none: ${none.get()}"
}
    
    val get = Host::get as KMutableProperty0<Int>
    get.set(1)
    if (get.get() != 1) {
println("""THEN""");
return "Fail get: ${get.get()}"
}
    
    val set = { Host.set } as KMutableProperty0<Int>
    set.set(1)
    if (set.get() != 1) {
println("""THEN""");
return "Fail set: ${set.get()}"
}

    val both = Host::both as KMutableProperty0<Int>
    both.set(1)
    if (both.get() != 1) {
println("""THEN""");
return "Fail both: ${both.get()}"
}

    val property = Host::property as KMutableProperty0<Int>
    property.set(1)
    if (property.get() != 1) {
println("""THEN""");
return "Fail property: ${property.get()}"
}
    
    return "OK"
}

