// COMPILE != OK. Modified in 379
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.jvm.*
// 
// var state: String = "value"
//     @JvmName("getter")
//     get
//     @JvmName("setter")
//     set
// 
// tailrec fun box(): String {
//     val p = ::state
// 
//     if (p.name != "state") {
// println("""THEN""");
// return "Fail name: ${p.name}"
// }
//     if (p.get() != "value") {
// println("""THEN""");
// return "Fail get: ${p.get()}"
// }
//     p.set("OK")
// 
//     val getterName = p.javaGetter!!.getName()
//     if (getterName != "getter") {
// println("""THEN""");
// return "Fail getter name: $getterName"
// }
// 
//     val setterName = p.javaSetter!!.getName()
//     if (setterName != "setter") {
// println("""THEN""");
// return "Fail setter name: $setterName"
// }
// 
//     return p.get()
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.jvm.*

var state: String = "value"
    @JvmName("getter")
    get
    @JvmName("setter")
    set

tailrec fun box(): String {
    val p = ::state

    if (this.name != "state") {
println("""THEN""");
return "Fail name: ${this.name}"
}
    if (this.get() != "value") {
println("""THEN""");
return "Fail get: ${this.get()}"
}
    p.run {

    if (name != "state") {
println("""THEN""");
return "Fail name: ${name}"
}
    if (get() != "value") {
println("""THEN""");
return "Fail get: ${get()}"
}
    set("OK")}

    val getterName = p.javaGetter!!.getName()
    if (getterName != "getter") {
println("""THEN""");
return "Fail getter name: $getterName"
}

    val setterName = p.javaSetter!!.getName()
    if (setterName != "setter") {
println("""THEN""");
return "Fail setter name: $setterName"
}

    return p.get()
}

