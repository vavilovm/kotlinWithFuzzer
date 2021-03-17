// Different compile happens on:JVM ,JVM -Xnew-inference

class MyEnum(val value: String)
fun crash() {
    val myEnum:Any = TODO()
if (myEnum !is MyEnum) 
        return
res = myEnum!!.value
}
var res:Any = TODO()
