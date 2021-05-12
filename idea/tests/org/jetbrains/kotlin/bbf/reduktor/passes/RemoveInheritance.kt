//package org.jetbrains.kotlin.bbf.reduktor.passes
//
//
//import org.jetbrains.kotlin.bbf.reduktor.util.dependencyTree.ClassDependencyTree
//import com.intellij.lang.ASTNode
//import org.jetbrains.kotlin.bbf.reduktor.executor.CompilerTestChecker
//import org.jetbrains.kotlin.bbf.reduktor.util.getAllChildrenNodes
//import org.jetbrains.kotlin.bbf.reduktor.util.getAllPSIChildrenOfType
//import org.jetbrains.kotlin.bbf.reduktor.util.getLine
//import org.jetbrains.kotlin.bbf.reduktor.util.getSignature
//import org.jetbrains.kotlin.lexer.KtTokens
//import org.jetbrains.kotlin.psi.*
//import org.jetbrains.kotlin.psi.psiUtil.getParentOfType
//
//class RemoveInheritance : SimplificationPass() {
//
//    override fun simplify() {
//        fileCopy = file
//        tree = ClassDependencyTree()
//        tree.constructTree(projectFiles)
//        //tree.nodes.forEach { println("NAME = ${it.typeNode.name} \n CH = ${it.getChildren().map { it.typeNode.name }} \n PAR = ${it.getParents().map { it.typeNode.name }}") }
//        //TODO if we cant find class with bug?
//        val classWithBug = file.getLine(checker.getErrorInfo().line)?.psi?.getParentOfType<KtClass>(true)
//        if (classWithBug != null) {
//            tryToRemoveInheritance(tree.getOrAddNode(classWithBug).typeNode)
//        } else {
//            return
//            /*classNodes
//                    .filter { it.getChildren().isEmpty() }
//                    .forEach { tryToRemoveInheritance(it) }*/
//        }
//    }
//
//    private fun tryToRemoveInheritance(klass: KtClass) {
//        val overrideProp = klass.getProperties()
//                .filter { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                .toMutableList()
//        val overrideFuncs = klass.getAllPSIChildrenOfType<KtNamedFunction>()
//                .filter { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                .toMutableList()
//        tryToRemoveInheritance1(tree.getOrAddNode(klass).typeNode, overrideFuncs, overrideProp)
//    }
//
//    //TODO: Dont work with override functions from another file
//    private fun tryToRemoveInheritance1(klass: KtClass, overrideFuncs: MutableList<KtNamedFunction>,
//                                        overrideProp: MutableList<KtProperty>) {
//        val classNode = tree.getOrAddNode(klass)
//        for (parent in classNode.getParents()) {
//            val parentClass = parent.typeNode
//            //Avoid recursion
//            if (parentClass.name == klass.name) continue
//            if (parentClass.isInterface()) {
//                val abstractFuncs = parentClass.getAllPSIChildrenOfType<KtNamedFunction>()
//                        .filterNot { it.hasBody() }
//                val abstractProps = parentClass.getProperties()
//                removeFuncsAndProperties(abstractProps, abstractFuncs, overrideFuncs, overrideProp)
//            } else {
//                val abstractFuncs = parentClass.getAllPSIChildrenOfType<KtNamedFunction>()
//                        .filter { it.modifierList?.hasModifier(KtTokens.ABSTRACT_KEYWORD) ?: false }
//                        .filterNot { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                val abstractProps = parentClass.getProperties()
//                        .filter { it.modifierList?.hasModifier(KtTokens.ABSTRACT_KEYWORD) ?: false }
//                        .filterNot { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                removeFuncsAndProperties(abstractProps, abstractFuncs, overrideFuncs, overrideProp)
//            }
//            parentClass.getAllPSIChildrenOfType<KtNamedFunction>()
//                    .filter { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                    .filter { it.getParentOfType<KtClass>(false) == parentClass }
//                    .forEach { overrideFuncs.add(it) }
//            parentClass.getProperties()
//                    .filter { it.modifierList?.hasModifier(KtTokens.OVERRIDE_KEYWORD) ?: false }
//                    .filter { it.getParentOfType<KtClass>(false) == parentClass }
//                    .forEach { overrideProp.add(it) }
//            tryToRemoveInheritance1(tree.getOrAddNode(parentClass).typeNode, overrideFuncs, overrideProp)
//        }
//    }
//
//
//    private fun removeFuncsAndProperties(abstractProps: List<KtProperty>, abstractFuncs: List<KtNamedFunction>,
//                                         overrideFuncs: MutableList<KtNamedFunction>, overrideProp: MutableList<KtProperty>) {
//        abstractFuncs.forEach { func ->
//            val funcToRemove = mutableListOf<ASTNode>()
//            overrideFuncs
//                    .filter { it.getSignature() == func.getSignature() }
//                    .forEach { funcToRemove.add(it.node) }
//            if (overrideFuncs.isNotEmpty()) {
//                val res: Boolean
//                if (!fileCopy.node.getAllChildrenNodes().contains(func.node)) {
//                    res = checker.removeNodesIfPossible(fileCopy, funcToRemove)
//                }
//                else {
//                    funcToRemove.add(func.node)
//                    res = checker.removeNodesIfPossible(fileCopy, funcToRemove)
//                    funcToRemove.remove(func.node)
//                }
//                if (!res) {
//                    funcToRemove.add(func.node)
//                    val f = funcToRemove[0].psi as KtNamedFunction
//                    funcToRemove[0] = f.modifierList!!.getModifier(KtTokens.OVERRIDE_KEYWORD)!!.node
//                    checker.removeNodesIfPossible(fileCopy, funcToRemove)
//                }
//            }
//        }
//        abstractProps.forEach { prop ->
//            overrideProp
//                    .filter { it.name == prop.name }
//                    .forEach {
//                        if (!fileCopy.node.getAllChildrenNodes().contains(prop.node))
//                            checker.removeNodeIfPossible(fileCopy, it.node)
//                        else
//                            checker.removeNodesIfPossible(fileCopy, listOf(it.node, prop.node))
//                    }
//        }
//    }
//
//    private val file = checker.curFile.psiFile as KtFile
//    private lateinit var tree: ClassDependencyTree
//    private lateinit var fileCopy: KtFile
//}
//
