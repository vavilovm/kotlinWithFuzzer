//package org.jetbrains.kotlin.bbf.bugfinder.generator.subjectgenerator
//
//import org.jetbrains.kotlin.bbf.bugfinder.util.generateRandomType
//import org.jetbrains.kotlin.bbf.bugfinder.util.getRandomVariableName
//import org.jetbrains.kotlin.bbf.reduktor.util.generateDefValuesAsString
//import org.jetbrains.kotlin.psi.KtProperty
//import ru.spbstu.kotlin.generate.util.nextInRange
//import java.lang.StringBuilder
//import java.util.*
//
//class Property(typeParam: String, needInitializer: Boolean) : Expression() {
//    override val value: KtProperty
//
//    init {
//        value = generateProperty(typeParam, needInitializer)
//    }
//
//    private fun generateProperty(typeParam: String, needInitializer: Boolean): KtProperty {
//        val resProp = StringBuilder()
//        when (Random().nextInRange(0, 2)) {
//            0 -> resProp.append("val ")
//            1 -> resProp.append("var ")
//        }
//        resProp.append(Random().getRandomVariableName(5))
//        val randomType = generateRandomType()
//        val initializer =
//            if (needInitializer) "= ${generateDefValuesAsString(randomType)}"
//            else ""
//        return factory.createProperty("$resProp: $randomType $initializer")
//    }
//
//    override fun toString(): String = value.text
//}