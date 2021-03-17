// Bug happens on JVM 
// FILE: tmp0.kt

enum class ContentType {
PLAIN_TEXT {
        override fun convert( text: String,targetType: ContentType)  = TODO()
    },
MARKDOWN {
        override fun convert( text: String,targetType: ContentType)   = 
            when (targetType) {
                MARKDOWN -> text
                PLAIN_TEXT -> ""
            }
    };
abstract fun convert( text: String,targetType: ContentType): Any
}
