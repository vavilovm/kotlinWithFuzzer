// Bug happens on JVM 
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
