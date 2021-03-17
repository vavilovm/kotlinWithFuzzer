// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box() 
 {
if (true) {} else {{
try {} finally {
        {}
    }
}}
}
