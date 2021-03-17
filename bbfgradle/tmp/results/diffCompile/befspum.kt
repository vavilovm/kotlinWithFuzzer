// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

fun box()  {
val l:Any
l = ArrayList<Int>()
val iterator = l.iterator()
if (iterator == null) 
        if (iterator!!.hasNext()) {}
}
