// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

package test
import kotlin.collections.*
import kotlin.sequences.*


interface TextField {
    fun getText(): String
}

interface InputTextField : TextField {
    fun setText(text: String)
}

interface MooableTextField : InputTextField {
    fun moo(a: Int, b: Int, c: Int): Int
}

class SimpleTextField : MooableTextField {
    private var text2 = ""
    override fun getText():String = TODO()
    override fun setText(text: String):Unit =TODO()
    override fun moo(a: Int, b: Int, c: Int):Int = TODO()
}

class TextFieldWrapper(textField: MooableTextField) : MooableTextField by textField

fun box() : String =TODO()

internal interface Sow : MooableTextField, InputTextField{

override fun moo(a: kotlin.Int, b: kotlin.Int, c: kotlin.Int): kotlin.Int = TODO()

var jfey: Set<MooableTextField> 

var LinkedHashSet<TextFieldWrapper>.eqqw: Int 
get() = TODO()
set(value) = TODO()

var gkyu: Set<SimpleTextField> 

var qrew: ArrayList<InputTextField> 

val qhpx: Short 

val ptnr: UByte 

var svuk: Array<InputTextField> 

var ubos: MooableTextField 

val spad: Long 

}

internal interface Wns : MooableTextField, InputTextField{

override fun setText(text: kotlin.String): kotlin.Unit = TODO()

var kpyq: InputTextField 

var pqrc: InputTextField 

var vcks: TextField 

var zyjt: Byte 

val Short.ewcr: Byte 
get() = TODO()


}

enum internal  class Jck (var hgp: Boolean, fmj: UShort = 8479.toUShort(), val tpg: Char, val hwx: Short){
HJ(true, 1399.toUShort(), '軫', -12448),
BQ(false, 14810.toUShort(), '箕', -18770);
private  class Vfc <T, S> (val hez: Double = 0.3861968979141617){

var kwba: Array<HashSet<Float>> = TODO()

val szgx: String = TODO()

val uhay: HashMap<S, InputTextField> = TODO()

var Sequence<MooableTextField>.qidg: S 
get() =  TODO()
set(value) = TODO()

var UShort.lloo: SimpleTextField 
get() =  SimpleTextField()
set(value) = TODO()

var scfj: Triple<UShort, Double, MooableTextField> = TODO()

var Array<Char>.lzgv: TextFieldWrapper 
get() =  TODO()
set(value) = TODO()

var mdca: S = TODO()

var rpvj: String = "tjxfu"

}
}

internal interface Orj : MutableSet<HashSet<Collection<SimpleTextField>>>, TextField, CharSequence{

override fun add(element: kotlin.collections.HashSet<kotlin.collections.Collection<test.SimpleTextField>>): kotlin.Boolean = TODO()

override fun remove(element: kotlin.collections.HashSet<kotlin.collections.Collection<test.SimpleTextField>>): kotlin.Boolean = TODO()

override val length:  kotlin.Int
override fun subSequence(startIndex: kotlin.Int, endIndex: kotlin.Int): kotlin.CharSequence = TODO()

val unzx: Set<TextField> 

var xizs: MooableTextField 

var Int.jywz: Triple<MooableTextField, HashSet<TextFieldWrapper>, UShort> 
get() = TODO()
set(value) = TODO()

var cxks: InputTextField 

val mcso: String 

val jrrp: UShort 

val idip: Collection<Boolean> 

}


