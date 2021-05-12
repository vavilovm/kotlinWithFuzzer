package org.jetbrains.kotlin.bbf.reduktor.passes

import org.jetbrains.kotlin.bbf.reduktor.util.PeepholeRegexes
import java.util.*

class PeepholePasses(private val isShort: Boolean = false) : SimplificationPass() {

    enum class Parentheses(val opening: Char, val closing: Char) {
        CURLY('{', '}'),
        ROUND('(', ')'),
        SQUARE('[', ']'),
        TRIANGLE('<', '>')
    }

    override fun simplify() {
        val text = simplifyText()
        checker.curFile.replacePsiFile(text, false)
    }

    fun simplifyText(): String {
        var res = file.text

        for (p in Parentheses.values()) {
            res = deleteInsideParentheses(res, p)
            if (isShort)
                return res
        }

        for (p in Parentheses.values()) {
            res = deleteParenthneses(res, p)
        }

        res = deleteBetweenSym(res, '.')
        res = deleteBetweenSym(res, ',')

        val occurrencesStr = TreeMap<IntRange, Map.Entry<Regex, String>>(Comparator<IntRange> { o1, o2 -> o1.start.compareTo(o2.start) })
        for (reg in PeepholeRegexes.del_regexes) {
            for (oc in reg.component1().findAll(res).toList()) {
                occurrencesStr.put(oc.range, reg)
            }
        }
        for (reg in PeepholeRegexes.regexes) {
            for (oc in reg.component1().findAll(res).toList()) {
                occurrencesStr.put(oc.range, reg)
            }
        }
        res = replaceOccurrences(res, occurrencesStr) { entry: Map.Entry<Regex, String>, _, _ -> entry.component2() }


        val occurrences = TreeMap<IntRange, Map.Entry<Regex, Regex>>(Comparator<IntRange> { o1, o2 -> o1.start.compareTo(o2.start) })
        for (reg in PeepholeRegexes.reg_toReg) {
            for (oc in reg.component1().findAll(res).toList()) {
                occurrences.put(oc.range, reg)
            }
        }
        res = replaceOccurrences(res, occurrences) { entry: Map.Entry<Regex, Regex>, intRange: IntRange, curRes: String ->
            entry.component2().find(curRes.substring(intRange))?.value.toString()
        }
        return res
    }

    private fun <T> replaceOccurrences(text: String, occurrences: TreeMap<IntRange, Map.Entry<Regex, T>>,
                                       replacementFun: ((Map.Entry<Regex, T>), IntRange, String) -> String): String {
        var diff = 0
        var res = text
        for (oc in occurrences) {
            val newRange = IntRange(oc.key.start - diff, oc.key.endInclusive - diff)
            val replacement = replacementFun.invoke(oc.value, newRange, res)
            val replaced = res.replaceRange(newRange, replacement)
            if (checker.checkTest(replaced)) {
                diff += res.substring(newRange).length - replacement.length
                res = replaced
            }
        }
        return res
    }

    private fun balancedParentheses(text: String, p: Parentheses, num: Int, onlyParentheses: Boolean = false): String {
        var n = num
        val stack = Stack<Int>()
        for ((i, ch) in text.withIndex()) {
            if (ch == p.opening) {
                stack.push(i)
            } else if (ch == p.closing && stack.isNotEmpty()) {
                val openInd = stack.pop()
                if (n-- == 0)
                    if (onlyParentheses) {
                        return text.removeRange(openInd, openInd + 1).removeRange(i - 1, i)
                    } else
                        return text.removeRange(openInd + 1, i)
            }
        }
        return ""
    }


    private fun numOfParentheses(text: String, p: Parentheses): Int =
            if (text.count { it == p.opening } == text.count { it == p.closing }) text.count { it == p.opening } else -1

    private fun deleteInsideParentheses(text: String, p: Parentheses): String {
        var res = text
        var i = 0
        var num = numOfParentheses(res, p)
        while (i < num) {
            val withoutPar = balancedParentheses(res, p, i)
            if (res != withoutPar && checker.checkTest(withoutPar)) {
                res = withoutPar
                val oldNum = num
                num = numOfParentheses(res, p)
                i -= oldNum - num
                //i = 0
            } else ++i

        }
        return res
    }

    private fun deleteParenthneses(text: String, p: Parentheses): String {
        var res = text
        var i = 0
        var num = numOfParentheses(res, p)
        while (i < num) {
            val withoutPar = balancedParentheses(res, p, i, true)
            if (res != withoutPar && checker.checkTest(withoutPar)) {
                res = withoutPar
                num = numOfParentheses(res, p)
            } else ++i

        }
        return res
    }

    private fun deleteBetweenSym(text: String, sym: Char): String {
        var res = text
        //Get all sym indexes
        while (true) {
            val dots = res.map { it == sym }.mapIndexed { index, b -> if (b) index else -1 }.filter { it != -1 }
            var i = 0
            if (dots.size < 2)
                break
            while (i != dots.size - 1) {
                val tmp = res.removeRange(dots[i], dots[i + 1])
                if (checker.checkTest(tmp)) {
                    res = tmp
                    break
                } else {
                    ++i
                }
            }
            break
        }
        return res
    }
}