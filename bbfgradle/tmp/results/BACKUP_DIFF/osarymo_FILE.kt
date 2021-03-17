// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

class Outer(val Int: String) {
    inner class Inner(
        val fn: () -> Unit = { "K" }
    ){
override fun toString(): String{
var res = ""
return res
}
}
override fun toString(): String{
var res = ""
res += Int.toString()
return res
}}

fun box() = Outer("long").Inner().fn()

data class Kla0(val a: Long){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box710() : String {
   val prope0 = Kla0(-10.toLong()).hashCode()
   val prope1 = (-10.toLong() as Long?)!!.hashCode()
   return if( prope0 == prope1 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$prope0 $prope1"
}
}

inline fun <reified Ty0 : Any> fu0(expected: String) {
    val prope2 = Ty0::class.javaPrimitiveType!!
    assert (prope2.canonicalName == expected) {
        "clazz name: ${prope2.canonicalName}"
    }
}

inline fun <reified Ty0 : Any> fu1() {
    val prope2 = Ty0::class.javaPrimitiveType
    assert (prope2 == null) {
        "clazz should be null: ${prope2!!.canonicalName}"
    }
}

fun box128(): String {
    fu0<Boolean>("boolean")
    fu0<Char>("char")
    fu0<Byte>("byte")
    fu0<Short>("short")
    fu0<Int>("int")
    fu0<Float>("float")
    fu0<Long>("long")
    fu0<Double>("double")
    fu0<Void>("void")

    fu1<String>()

    return "OK"
}

class Kla1(val value: Int) {
    // for (i in 1..254) { print("p${"%03d".format(i)}: A, "); if (i % 10 == 0) println() }; println()

    fun fu2(
        p001: Kla1, p002: Kla1, p003: Kla1, p004: Kla1, p005: Kla1, p006: Kla1, p007: Kla1, p008: Kla1, p009: Kla1, p010: Kla1,
        p011: Kla1, p012: Kla1, p013: Kla1, p014: Kla1, p015: Kla1, p016: Kla1, p017: Kla1, p018: Kla1, p019: Kla1, p020: Kla1,
        p021: Kla1, p022: Kla1, p023: Kla1, p024: Kla1, p025: Kla1, p026: Kla1, p027: Kla1, p028: Kla1, p029: Kla1, p030: Kla1,
        p031: Kla1, p032: Kla1, p033: Kla1, p034: Kla1, p035: Kla1, p036: Kla1, p037: Kla1, p038: Kla1, p039: Kla1, p040: Kla1,
        p041: Kla1, p042: Kla1, p043: Kla1, p044: Kla1, p045: Kla1, p046: Kla1, p047: Kla1, p048: Kla1, p049: Kla1, p050: Kla1,
        p051: Kla1, p052: Kla1, p053: Kla1, p054: Kla1, p055: Kla1, p056: Kla1, p057: Kla1, p058: Kla1, p059: Kla1, p060: Kla1,
        p061: Kla1, p062: Kla1, p063: Kla1, p064: Kla1, p065: Kla1, p066: Kla1, p067: Kla1, p068: Kla1, p069: Kla1, p070: Kla1,
        p071: Kla1, p072: Kla1, p073: Kla1, p074: Kla1, p075: Kla1, p076: Kla1, p077: Kla1, p078: Kla1, p079: Kla1, p080: Kla1,
        p081: Kla1, p082: Kla1, p083: Kla1, p084: Kla1, p085: Kla1, p086: Kla1, p087: Kla1, p088: Kla1, p089: Kla1, p090: Kla1,
        p091: Kla1, p092: Kla1, p093: Kla1, p094: Kla1, p095: Kla1, p096: Kla1, p097: Kla1, p098: Kla1, p099: Kla1, p100: Kla1,
        p101: Kla1, p102: Kla1, p103: Kla1, p104: Kla1, p105: Kla1, p106: Kla1, p107: Kla1, p108: Kla1, p109: Kla1, p110: Kla1,
        p111: Kla1, p112: Kla1, p113: Kla1, p114: Kla1, p115: Kla1, p116: Kla1, p117: Kla1, p118: Kla1, p119: Kla1, p120: Kla1,
        p121: Kla1, p122: Kla1, p123: Kla1, p124: Kla1, p125: Kla1, p126: Kla1, p127: Kla1, p128: Kla1, p129: Kla1, p130: Kla1,
        p131: Kla1, p132: Kla1, p133: Kla1, p134: Kla1, p135: Kla1, p136: Kla1, p137: Kla1, p138: Kla1, p139: Kla1, p140: Kla1,
        p141: Kla1, p142: Kla1, p143: Kla1, p144: Kla1, p145: Kla1, p146: Kla1, p147: Kla1, p148: Kla1, p149: Kla1, p150: Kla1,
        p151: Kla1, p152: Kla1, p153: Kla1, p154: Kla1, p155: Kla1, p156: Kla1, p157: Kla1, p158: Kla1, p159: Kla1, p160: Kla1,
        p161: Kla1, p162: Kla1, p163: Kla1, p164: Kla1, p165: Kla1, p166: Kla1, p167: Kla1, p168: Kla1, p169: Kla1, p170: Kla1,
        p171: Kla1, p172: Kla1, p173: Kla1, p174: Kla1, p175: Kla1, p176: Kla1, p177: Kla1, p178: Kla1, p179: Kla1, p180: Kla1,
        p181: Kla1, p182: Kla1, p183: Kla1, p184: Kla1, p185: Kla1, p186: Kla1, p187: Kla1, p188: Kla1, p189: Kla1, p190: Kla1,
        p191: Kla1, p192: Kla1, p193: Kla1, p194: Kla1, p195: Kla1, p196: Kla1, p197: Kla1, p198: Kla1, p199: Kla1, p200: Kla1,
        p201: Kla1, p202: Kla1, p203: Kla1, p204: Kla1, p205: Kla1, p206: Kla1, p207: Kla1, p208: Kla1, p209: Kla1, p210: Kla1,
        p211: Kla1, p212: Kla1, p213: Kla1, p214: Kla1, p215: Kla1, p216: Kla1, p217: Kla1, p218: Kla1, p219: Kla1, p220: Kla1,
        p221: Kla1, p222: Kla1, p223: Kla1, p224: Kla1, p225: Kla1, p226: Kla1, p227: Kla1, p228: Kla1, p229: Kla1, p230: Kla1,
        p231: Kla1, p232: Kla1, p233: Kla1, p234: Kla1, p235: Kla1, p236: Kla1, p237: Kla1, p238: Kla1, p239: Kla1, p240: Kla1,
        p241: Kla1, p242: Kla1, p243: Kla1, p244: Kla1, p245: Kla1, p246: Kla1, p247: Kla1, p248: Kla1, p249: Kla1, p250: Kla1,
        p251: Kla1, p252: Kla1, p253: Kla1, p254: Kla1
    ) {
        fu3(this, 0)

        // for (i in 1..254) { print("check(p${"%03d".format(i)}, $i)"); if (i % 6 == 0) println() else print("; ") }; println()

        fu3(p001, 1); fu3(p002, 2); fu3(p003, 3); fu3(p004, 4); fu3(p005, 5); fu3(p006, 6)
        fu3(p007, 7); fu3(p008, 8); fu3(p009, 9); fu3(p010, 10); fu3(p011, 11); fu3(p012, 12)
        fu3(p013, 13); fu3(p014, 14); fu3(p015, 15); fu3(p016, 16); fu3(p017, 17); fu3(p018, 18)
        fu3(p019, 19); fu3(p020, 20); fu3(p021, 21); fu3(p022, 22); fu3(p023, 23); fu3(p024, 24)
        fu3(p025, 25); fu3(p026, 26); fu3(p027, 27); fu3(p028, 28); fu3(p029, 29); fu3(p030, 30)
        fu3(p031, 31); fu3(p032, 32); fu3(p033, 33); fu3(p034, 34); fu3(p035, 35); fu3(p036, 36)
        fu3(p037, 37); fu3(p038, 38); fu3(p039, 39); fu3(p040, 40); fu3(p041, 41); fu3(p042, 42)
        fu3(p043, 43); fu3(p044, 44); fu3(p045, 45); fu3(p046, 46); fu3(p047, 47); fu3(p048, 48)
        fu3(p049, 49); fu3(p050, 50); fu3(p051, 51); fu3(p052, 52); fu3(p053, 53); fu3(p054, 54)
        fu3(p055, 55); fu3(p056, 56); fu3(p057, 57); fu3(p058, 58); fu3(p059, 59); fu3(p060, 60)
        fu3(p061, 61); fu3(p062, 62); fu3(p063, 63); fu3(p064, 64); fu3(p065, 65); fu3(p066, 66)
        fu3(p067, 67); fu3(p068, 68); fu3(p069, 69); fu3(p070, 70); fu3(p071, 71); fu3(p072, 72)
        fu3(p073, 73); fu3(p074, 74); fu3(p075, 75); fu3(p076, 76); fu3(p077, 77); fu3(p078, 78)
        fu3(p079, 79); fu3(p080, 80); fu3(p081, 81); fu3(p082, 82); fu3(p083, 83); fu3(p084, 84)
        fu3(p085, 85); fu3(p086, 86); fu3(p087, 87); fu3(p088, 88); fu3(p089, 89); fu3(p090, 90)
        fu3(p091, 91); fu3(p092, 92); fu3(p093, 93); fu3(p094, 94); fu3(p095, 95); fu3(p096, 96)
        fu3(p097, 97); fu3(p098, 98); fu3(p099, 99); fu3(p100, 100); fu3(p101, 101); fu3(p102, 102)
        fu3(p103, 103); fu3(p104, 104); fu3(p105, 105); fu3(p106, 106); fu3(p107, 107); fu3(p108, 108)
        fu3(p109, 109); fu3(p110, 110); fu3(p111, 111); fu3(p112, 112); fu3(p113, 113); fu3(p114, 114)
        fu3(p115, 115); fu3(p116, 116); fu3(p117, 117); fu3(p118, 118); fu3(p119, 119); fu3(p120, 120)
        fu3(p121, 121); fu3(p122, 122); fu3(p123, 123); fu3(p124, 124); fu3(p125, 125); fu3(p126, 126)
        fu3(p127, 127); fu3(p128, 128); fu3(p129, 129); fu3(p130, 130); fu3(p131, 131); fu3(p132, 132)
        fu3(p133, 133); fu3(p134, 134); fu3(p135, 135); fu3(p136, 136); fu3(p137, 137); fu3(p138, 138)
        fu3(p139, 139); fu3(p140, 140); fu3(p141, 141); fu3(p142, 142); fu3(p143, 143); fu3(p144, 144)
        fu3(p145, 145); fu3(p146, 146); fu3(p147, 147); fu3(p148, 148); fu3(p149, 149); fu3(p150, 150)
        fu3(p151, 151); fu3(p152, 152); fu3(p153, 153); fu3(p154, 154); fu3(p155, 155); fu3(p156, 156)
        fu3(p157, 157); fu3(p158, 158); fu3(p159, 159); fu3(p160, 160); fu3(p161, 161); fu3(p162, 162)
        fu3(p163, 163); fu3(p164, 164); fu3(p165, 165); fu3(p166, 166); fu3(p167, 167); fu3(p168, 168)
        fu3(p169, 169); fu3(p170, 170); fu3(p171, 171); fu3(p172, 172); fu3(p173, 173); fu3(p174, 174)
        fu3(p175, 175); fu3(p176, 176); fu3(p177, 177); fu3(p178, 178); fu3(p179, 179); fu3(p180, 180)
        fu3(p181, 181); fu3(p182, 182); fu3(p183, 183); fu3(p184, 184); fu3(p185, 185); fu3(p186, 186)
        fu3(p187, 187); fu3(p188, 188); fu3(p189, 189); fu3(p190, 190); fu3(p191, 191); fu3(p192, 192)
        fu3(p193, 193); fu3(p194, 194); fu3(p195, 195); fu3(p196, 196); fu3(p197, 197); fu3(p198, 198)
        fu3(p199, 199); fu3(p200, 200); fu3(p201, 201); fu3(p202, 202); fu3(p203, 203); fu3(p204, 204)
        fu3(p205, 205); fu3(p206, 206); fu3(p207, 207); fu3(p208, 208); fu3(p209, 209); fu3(p210, 210)
        fu3(p211, 211); fu3(p212, 212); fu3(p213, 213); fu3(p214, 214); fu3(p215, 215); fu3(p216, 216)
        fu3(p217, 217); fu3(p218, 218); fu3(p219, 219); fu3(p220, 220); fu3(p221, 221); fu3(p222, 222)
        fu3(p223, 223); fu3(p224, 224); fu3(p225, 225); fu3(p226, 226); fu3(p227, 227); fu3(p228, 228)
        fu3(p229, 229); fu3(p230, 230); fu3(p231, 231); fu3(p232, 232); fu3(p233, 233); fu3(p234, 234)
        fu3(p235, 235); fu3(p236, 236); fu3(p237, 237); fu3(p238, 238); fu3(p239, 239); fu3(p240, 240)
        fu3(p241, 241); fu3(p242, 242); fu3(p243, 243); fu3(p244, 244); fu3(p245, 245); fu3(p246, 246)
        fu3(p247, 247); fu3(p248, 248); fu3(p249, 249); fu3(p250, 250); fu3(p251, 251); fu3(p252, 252)
        fu3(p253, 253); fu3(p254, 254)
    }

    private fun fu3(a: Kla1, value: Int) {
        if (a.value != value){
println("""THEN""");

            throw AssertionError("Expected $value, actual ${a.value}")
}
    }
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box349(): String {
    val prope3 = Kla1(0)::fu2

    // for (i in 1..254) { print("A($i), "); if (i % 12 == 0) println() }; println()
    prope3(
        Kla1(1), Kla1(2), Kla1(3), Kla1(4), Kla1(5), Kla1(6), Kla1(7), Kla1(8), Kla1(9), Kla1(10), Kla1(11), Kla1(12),
        Kla1(13), Kla1(14), Kla1(15), Kla1(16), Kla1(17), Kla1(18), Kla1(19), Kla1(20), Kla1(21), Kla1(22), Kla1(23), Kla1(24),
        Kla1(25), Kla1(26), Kla1(27), Kla1(28), Kla1(29), Kla1(30), Kla1(31), Kla1(32), Kla1(33), Kla1(34), Kla1(35), Kla1(36),
        Kla1(37), Kla1(38), Kla1(39), Kla1(40), Kla1(41), Kla1(42), Kla1(43), Kla1(44), Kla1(45), Kla1(46), Kla1(47), Kla1(48),
        Kla1(49), Kla1(50), Kla1(51), Kla1(52), Kla1(53), Kla1(54), Kla1(55), Kla1(56), Kla1(57), Kla1(58), Kla1(59), Kla1(60),
        Kla1(61), Kla1(62), Kla1(63), Kla1(64), Kla1(65), Kla1(66), Kla1(67), Kla1(68), Kla1(69), Kla1(70), Kla1(71), Kla1(72),
        Kla1(73), Kla1(74), Kla1(75), Kla1(76), Kla1(77), Kla1(78), Kla1(79), Kla1(80), Kla1(81), Kla1(82), Kla1(83), Kla1(84),
        Kla1(85), Kla1(86), Kla1(87), Kla1(88), Kla1(89), Kla1(90), Kla1(91), Kla1(92), Kla1(93), Kla1(94), Kla1(95), Kla1(96),
        Kla1(97), Kla1(98), Kla1(99), Kla1(100), Kla1(101), Kla1(102), Kla1(103), Kla1(104), Kla1(105), Kla1(106), Kla1(107), Kla1(108),
        Kla1(109), Kla1(110), Kla1(111), Kla1(112), Kla1(113), Kla1(114), Kla1(115), Kla1(116), Kla1(117), Kla1(118), Kla1(119), Kla1(120),
        Kla1(121), Kla1(122), Kla1(123), Kla1(124), Kla1(125), Kla1(126), Kla1(127), Kla1(128), Kla1(129), Kla1(130), Kla1(131), Kla1(132),
        Kla1(133), Kla1(134), Kla1(135), Kla1(136), Kla1(137), Kla1(138), Kla1(139), Kla1(140), Kla1(141), Kla1(142), Kla1(143), Kla1(144),
        Kla1(145), Kla1(146), Kla1(147), Kla1(148), Kla1(149), Kla1(150), Kla1(151), Kla1(152), Kla1(153), Kla1(154), Kla1(155), Kla1(156),
        Kla1(157), Kla1(158), Kla1(159), Kla1(160), Kla1(161), Kla1(162), Kla1(163), Kla1(164), Kla1(165), Kla1(166), Kla1(167), Kla1(168),
        Kla1(169), Kla1(170), Kla1(171), Kla1(172), Kla1(173), Kla1(174), Kla1(175), Kla1(176), Kla1(177), Kla1(178), Kla1(179), Kla1(180),
        Kla1(181), Kla1(182), Kla1(183), Kla1(184), Kla1(185), Kla1(186), Kla1(187), Kla1(188), Kla1(189), Kla1(190), Kla1(191), Kla1(192),
        Kla1(193), Kla1(194), Kla1(195), Kla1(196), Kla1(197), Kla1(198), Kla1(199), Kla1(200), Kla1(201), Kla1(202), Kla1(203), Kla1(204),
        Kla1(205), Kla1(206), Kla1(207), Kla1(208), Kla1(209), Kla1(210), Kla1(211), Kla1(212), Kla1(213), Kla1(214), Kla1(215), Kla1(216),
        Kla1(217), Kla1(218), Kla1(219), Kla1(220), Kla1(221), Kla1(222), Kla1(223), Kla1(224), Kla1(225), Kla1(226), Kla1(227), Kla1(228),
        Kla1(229), Kla1(230), Kla1(231), Kla1(232), Kla1(233), Kla1(234), Kla1(235), Kla1(236), Kla1(237), Kla1(238), Kla1(239), Kla1(240),
        Kla1(241), Kla1(242), Kla1(243), Kla1(244), Kla1(245), Kla1(246), Kla1(247), Kla1(248), Kla1(249), Kla1(250), Kla1(251), Kla1(252),
        Kla1(253), Kla1(254)
    )

    return "OK"
}


