// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.A
open class SuperFoo {
    public fun bar(): String {
        
val k = false
try
{if (this is (Foo)?) {
            superFoo() // Smart cast
            return baz()!! // Cannot be cast
        }}
catch(e: Exception){}
finally{}

        
val y = false
if (y) {return baz()!!} else {return baz()!!}

    }

    public fun baz() = "OK"
}

class Foo : SuperFoo() {
    public fun superFoo() {}
}

fun box2(): (String)?  {
   
val u = false
if (u) {return A().test()} else {return A().test()}

}
//File: tmp/tmp1.kt
package b


import kotlin.reflect.KProperty
import a.Foo
sealed class Result {
    class Failure(val exception: (Exception)) : Result()
    class Success(val message: String) : Result()
}

fun box(): (String)? = Foo()!!.bar()
//File: tmp/tmp2.kt
package c


import b.Result
import b.Result.Failure
import b.Result.Success
class A {
  fun Double.foo(a: Double = 1.0): Double {
      return a!!
  }

  fun test(): String {
      if (1.0!!.foo()!! != 1.0) return "fail"
      if (1.0.foo(2.0) != 2.0) return "fail"
      return "OK"
  }
}

fun box1(): String {
    var result: Result
    try {
        result = Result.Success("OK")
    }
    catch (e: Exception) {
        result = Result.Failure(Exception()!!)
    }

    when (result) {
        is Result.Failure -> throw result!!.exception
        is Result.Success -> return result.message!!
    }
}