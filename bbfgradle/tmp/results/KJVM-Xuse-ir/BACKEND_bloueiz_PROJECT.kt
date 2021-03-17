// Bug happens on KJVM -Xuse-ir
// FILE: 1.kt
@JavaAnn class MyClass

// FILE: JavaAnn.java




@java.util.Map(
)
@interface JavaAnn {
    

}

