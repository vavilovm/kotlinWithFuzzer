// COMPILE != OK. Modified in 637
// MODIFIED by Convert to run intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_RUNTIME
// 
// import java.io.*
// import kotlin.test.*
// 
// public class Foo(val prop: String) {
//     fun method() {}
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val baos = ByteArrayOutputStream()
//     val oos = ObjectOutputStream(baos)
//     oos.writeObject(Foo::prop)
//     oos.writeObject(Foo::method)
//     oos.writeObject(::Foo)
//     oos.close()
// 
//     val bais = ByteArrayInputStream(baos.toByteArray())
//     val ois = ObjectInputStream(bais)
//     assertEquals(Foo::prop, ois.readObject())
//     assertEquals(Foo::method, ois.readObject())
//     assertEquals(::Foo, ois.readObject())
//     ois.close()
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_RUNTIME

import java.io.*
import kotlin.test.*

public class Foo(val prop: String) {
    fun method() {}
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val baos = ByteArrayOutputStream()
    val oos = ObjectOutputStream(baos)
    oos.writeObject(Foo::prop)
    oos.writeObject(Foo::method)
    oos.writeObject(::Foo)
    oos.close()

    val bais = ByteArrayInputStream(baos.toByteArray())
    val ois = ObjectInputStream(bais)
    assertEquals(Foo::prop, this.readObject())
    assertEquals(Foo::method, this.readObject())
    assertEquals(::Foo, this.readObject())
    ois.run {
    assertEquals(Foo::prop, readObject())
    assertEquals(Foo::method, readObject())
    assertEquals(::Foo, readObject())
    close()}

    return "OK"
}

