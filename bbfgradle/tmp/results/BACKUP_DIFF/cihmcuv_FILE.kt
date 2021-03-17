// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.properties.Delegates
fun foo(i: Int): Int {
  var count = i;
  var result = 0;
  while(count > 0){
println("""WHILE (${count > 0})""");

    count = count - 1;
    if (count <= 2) {
println("""THEN""");
continue
};
    result = result + count;
}
  return result;
}

fun box(): String {
  if (foo(4) != 3) {
println("""THEN""");
return "Fail 1"
}
  if (foo(5) != 7) {
println("""THEN""");
return "Fail 2"
}
  return "OK"
}

object Kla0 {
    public var prope0: String
        by Delegates.observable("wxalf") { prop, old, new -> }
        private set
}

open class Kla1 {
    public var prope1: String
        by Delegates.observable("") { prop, old, new -> }
        protected set
override fun toString(): String{
var res = ""
res += prope1.toString()
return res
}}

class Kla2 : Kla1() {
    init {
        prope1 = (foo(foo(4))).toChar().toString()
    }
}

fun box563(): String =
        Kla0.prope0 + (foo(0)).toDouble().toString()


