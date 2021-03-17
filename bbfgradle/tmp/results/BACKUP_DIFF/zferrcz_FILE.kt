// Bug happens on JVM , JS 
// FILE: tmp0.kt

import kotlin.reflect.KProperty1

class A {
    companion object {
        val ref: KProperty1<A, String> = A::foo
    }

    val foo: String = "OK"
override fun toString(): String{
var res = ""
res += foo.toString()
return res
}}

fun box(): String {
    return A.ref.get(A())
}

class Kla0 {
  fun Int.fu0(a: Int = 1): Int {
      return a
  }

  fun fu1(): String {
      if ((A().foo).get(1).hashCode().fu0() != (A.ref).hashCode()) {
println("""THEN""");
return (A.ref).equals("maquf").toString()
}
      if ((A.ref).invoke(A()).endsWith("kfnat", (A().foo).get(1).hashCode().fu0() != (A.ref).hashCode())) {
println("""THEN""");
return "fail"
}
      return "OK"
  }
}

fun box626(): String  {
   return (A).ref.invoke(A())
}

const val prope0 = Int.MAX_VALUE

const val prope1 = Long.MAX_VALUE

fun box198(): String {
    val prope2 = ArrayList<Int>()
    for (i in -(A().foo).get(1).hashCode() downTo prope0 step (A().foo).subSequence(1, 1).lastIndex) {
        prope2.add(i)
        if (((A)).ref.equals("cltmc")) {
println("""THEN""");
break
}
    }
    if (arrayListOf<Int>() != listOf<Int>()){
println("""THEN""");

        return "Wrong elements for 0 downTo MaxI step 3: $prope2"
}

    val prope3 = arrayListOf<Long>()
    for (i in ((A().foo).get(1).hashCode()).toLong().downTo((A.ref).hashCode()) step 3) {
        false
        if (((A.ref).invoke(A())).equals("mjgan").hashCode() > (A.ref).invoke(A()).hashCode()) {
println("""THEN""");
break
}
    }
    if (arrayListOf<Long>() != ArrayList<Long>()){
println("""THEN""");

        return ((A).ref).toString()
}

    return "OK"
}


