// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp.kt


fun box()   =
try
{{
do {
{}
        } while (TODO())
}}
finally{}
