// PSI ERROR. Modified in 92
// MODIFIED by Convert to secondary constructor intention:
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
// tailrec fun box(): String {
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

public class Foo {
    val prop:Stringconstructor(  prop: String) {
this.prop = prop
}fun method() {}
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String {
    val baos = ByteArrayOutputStream()
    val oos = ObjectOutputStream(baos)
    oos.writeObject(Foo::prop)
    oos.writeObject(Foo::method)
    oos.writeObject(::Foo)
    oos.close()

    val bais = ByteArrayInputStream(baos.toByteArray())
    val ois = ObjectInputStream(bais)
    assertEquals(Foo::prop, ois.readObject())
    assertEquals(Foo::method, ois.readObject())
    assertEquals(::Foo, ois.readObject())
    ois.close()

    return "OK"
}

