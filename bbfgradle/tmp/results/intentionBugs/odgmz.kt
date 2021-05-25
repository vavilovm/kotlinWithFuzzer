// COMPILE != OK. Modified in 61
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// object A {
//     object B {
//         object C {
//             val ok = "OK"
//         }
//     }
// }
// 
// tailrec fun box() = A.B.C.ok
// 

object A {
    object B {
        object C {
            fun getOk() = "OK"
        }
    }
}

tailrec fun box() = A.B.C.ok

