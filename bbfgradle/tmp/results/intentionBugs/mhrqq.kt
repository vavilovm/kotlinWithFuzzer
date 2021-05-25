// EXECUTION FAILED AFTER INTENTION pos 155
// MODIFIED by Convert property getter to initializer intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// interface Addable {
//     fun add(s: String): Boolean = true
// }
// 
// class C : Addable, List<String> {
//     override val size: Int get() = null!!
//     override fun isEmpty(): Boolean = null!!
//     override fun contains(o: String): Boolean = null!!
//     override fun iterator(): Iterator<String> = null!!
//     override fun containsAll(c: Collection<String>): Boolean = null!!
//     override fun get(index: Int): String = null!!
//     override fun indexOf(o: String): Int = null!!
//     override fun lastIndexOf(o: String): Int = null!!
//     override fun listIterator(): ListIterator<String> = null!!
//     override fun listIterator(index: Int): ListIterator<String> = null!!
//     override fun subList(fromIndex: Int, toIndex: Int): List<String> = null!!
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// tailrec fun box(): String {
//     try{
// println("""TRY""");
// 
//         val a = C()
//         if (!a.add("")) {
// println("""THEN""");
// return "Fail 1"
// }
//         if (!(a as Addable).add("")) {
// println("""THEN""");
// return "Fail 2"
// }
//         if (!(a as java.util.List<String>).add("")) {
// println("""THEN""");
// return "Fail 3"
// }
//         return "OK"
// } catch (e: UnsupportedOperationException){
// println("""CATCH e: UnsupportedOperationException""");
// 
//         return "Fail: no stub method should be generated"
// }
// }
// 

// TARGET_BACKEND: JVM

interface Addable {
    fun add(s: String): Boolean = true
}

class C : Addable, List<String> {
    override val size: Int=null!!
    override fun isEmpty(): Boolean = null!!
    override fun contains(o: String): Boolean = null!!
    override fun iterator(): Iterator<String> = null!!
    override fun containsAll(c: Collection<String>): Boolean = null!!
    override fun get(index: Int): String = null!!
    override fun indexOf(o: String): Int = null!!
    override fun lastIndexOf(o: String): Int = null!!
    override fun listIterator(): ListIterator<String> = null!!
    override fun listIterator(index: Int): ListIterator<String> = null!!
    override fun subList(fromIndex: Int, toIndex: Int): List<String> = null!!
override fun toString(): String{
var res = ""
return res
}}

tailrec fun box(): String {
    try{
println("""TRY""");

        val a = C()
        if (!a.add("")) {
println("""THEN""");
return "Fail 1"
}
        if (!(a as Addable).add("")) {
println("""THEN""");
return "Fail 2"
}
        if (!(a as java.util.List<String>).add("")) {
println("""THEN""");
return "Fail 3"
}
        return "OK"
} catch (e: UnsupportedOperationException){
println("""CATCH e: UnsupportedOperationException""");

        return "Fail: no stub method should be generated"
}
}

