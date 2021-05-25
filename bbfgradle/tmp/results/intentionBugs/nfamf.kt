// EXECUTION FAILED AFTER INTENTION pos 163
// MODIFIED by Convert property getter to initializer intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// interface Addable {
//     infix fun add(s: String): Boolean = true
// }
// 
// class C : Addable, List<String> {
//     override val size: Int get() = null!!
//     override tailrec fun isEmpty(): Boolean = null!!
//     override tailrec operator fun contains(o: String): Boolean = null!!
//     override fun iterator(): Iterator<String> = null!!
//     override tailrec fun containsAll(c: Collection<String>): Boolean = null!!
//     override tailrec infix fun get(index: Int): String = null!!
//     override fun indexOf(o: String): Int = null!!
//     override fun lastIndexOf(o: String): Int = null!!
//     override tailrec fun listIterator(): ListIterator<String> = null!!
//     override infix fun listIterator(index: Int): ListIterator<String> = null!!
//     override tailrec fun subList(fromIndex: Int, toIndex: Int): List<String> = null!!
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
    infix fun add(s: String): Boolean = true
}

class C : Addable, List<String> {
    override val size: Int=null!!
    override tailrec fun isEmpty(): Boolean = null!!
    override tailrec operator fun contains(o: String): Boolean = null!!
    override fun iterator(): Iterator<String> = null!!
    override tailrec fun containsAll(c: Collection<String>): Boolean = null!!
    override tailrec infix fun get(index: Int): String = null!!
    override fun indexOf(o: String): Int = null!!
    override fun lastIndexOf(o: String): Int = null!!
    override tailrec fun listIterator(): ListIterator<String> = null!!
    override infix fun listIterator(index: Int): ListIterator<String> = null!!
    override tailrec fun subList(fromIndex: Int, toIndex: Int): List<String> = null!!
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

