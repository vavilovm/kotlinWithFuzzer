// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.concurrent.*
import java.util.concurrent.atomic.*

fun thread(block: ()->Unit ) {
    val thread = object: Thread() {
        override fun run() {
            block()
        }
    }
    thread.start()
}

fun box() : String {
   val mtref = AtomicInteger()
   val cdl = CountDownLatch(11)
   for(i in 0..10) {
       thread {
          var current = 0
          do{
println("""DO WHILE (${current < 100})""");

              current = synchronized(mtref) {
                val v = mtref.get() + 1
                if(v < 100)
                    {
println("""THEN""");
mtref.set(v+1)
}
                v
              }
}
          while(current < 100)
          cdl.countDown()
       }
   }
   cdl.await()
   return if(mtref.get() == 100) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
mtref.get().toString()
}
}
