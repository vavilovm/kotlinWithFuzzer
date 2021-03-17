// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// FILE: tmp0.kt


import java.util.concurrent.*
import java.util.concurrent.atomic.*
open class Base(val callback: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class Outer {
    val ok = "OK"

    inner class Inner : Base({ { ok }() })
override fun toString(): String{
var res = ""
res += ok.toString()
return res
}}

fun box(): String =
        Outer().Inner().callback()

fun fu0(vararg a : Int) = a // BUG

val IntArray.prope0: IntRange get() = IntRange(0, fu1())

fun IntArray.fu1() = size - 1

fun box398() : String {
    val prope1 = fu0(789, 678, 567, 456, 345, 234, 123, 12)
    val prope2 = HashSet<Int>()
    for (i in prope1.prope0)
        for (j in i..prope1.fu1())
             prope2.add(prope1[i] - prope1[j])
    val size = prope2.size

    if (size != 8) {
println("""THEN""");
return "Fail $size"
}
    return "OK"
}

fun fu2(block: ()->Unit ) {
    val fu2 = object: Thread() {
        override fun run() {
            block()
        }
    }
    fu2.start()
}

fun box775() : String {
   val prope4 = AtomicInteger()
   val prope5 = CountDownLatch(11)
   for(i in 0..10) {
       fu2 {
          var prope6 = 0
          do{
println("""DO WHILE (${prope6 < 100})""");

              prope6 = synchronized(prope4) {
                val prope7 = prope4.get() + 1
                if(prope7 < 100)
                    {
println("""THEN""");
prope4.set(prope7+1)
}
                prope7
              }
}
          while(prope6 < 100)
          prope5.countDown()
       }
   }
   prope5.await()
   return if(prope4.get() == 100) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
prope4.get().toString()
}
}


