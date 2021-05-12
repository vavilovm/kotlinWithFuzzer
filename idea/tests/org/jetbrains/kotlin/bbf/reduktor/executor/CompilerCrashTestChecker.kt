package org.jetbrains.kotlin.bbf.reduktor.executor

import org.jetbrains.kotlin.bbf.reduktor.executor.backends.CommonBackend
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation

class KotlincInvokeStatus(
        val combinedOutput: String,
        val isCompileSuccess: Boolean,
        val hasException: Boolean,
        val hasTimeout: Boolean,
        val locations: List<CompilerMessageSourceLocation> = listOf()
) {
    fun hasCompilerCrash(): Boolean = hasTimeout || hasException

    fun hasCompilationError(): Boolean = !isCompileSuccess
}

open class CommonCompilerCrashTestChecker(private val backend: CommonBackend?)
//    :
//    CompilerTestChecker {
//
//    override fun removeNodeIfPossible(file: PsiFile, node: ASTNode): Boolean {
//        val tmp = KtPsiFactory(file.project).createWhiteSpace("\n")
//        return replaceNodeIfPossible(file, node, tmp.node)
//    }
//
//    override fun removeNodeIfPossible(file: FileASTNode, node: ASTNode) {
//        val ktFile = file.psi as KtFile
//        removeNodeIfPossible(ktFile, node)
//    }
//
//    override fun removeNodesIfPossible(file: PsiFile, nodes: List<ASTNode>): Boolean {
//        val copies = mutableListOf<ASTNode>()
//        val whiteSpaces = mutableListOf<ASTNode>()
//        nodes.forEach { copies.add(it.copyElement()); whiteSpaces.add(KtPsiFactory(file.project).createWhiteSpace("\n").node) }
//        for ((i, node) in nodes.withIndex()) {
//            for (p in node.getAllParentsWithoutNode()) {
//                try {
//                    p.replaceChild(node, whiteSpaces[i])
//                    break
//                } catch (e: AssertionError) {
//                }
//            }
//        }
//        if (!checkTest(file.text)) {
//            for ((i, node) in nodes.withIndex()) {
//                for (p in whiteSpaces[i].getAllParentsWithoutNode()) {
//                    try {
//                        p.replaceChild(whiteSpaces[i], node)
//                        break
//                    } catch (e: AssertionError) {
//                    }
//                }
//            }
//            return false
//        } else return true
//    }
//
//
//    override fun replaceNodeOnItChild(file: PsiFile, node: ASTNode, replacement: ASTNode): ASTNode? {
//        //If we trying to replace parent node to it child
//        if (node.getAllChildrenNodes().contains(replacement)) {
//            val backup = node.copyElement()
//            node.replaceThis(replacement)
//            if (!checkTest(file.text, file.name)) {
//                log.debug("REPLACING BACK")
//                replacement.replaceThis(backup)
//                return backup
//            } else {
//                log.debug("SUCCESSFUL DELETING")
//                return null
//            }
//        }
//
//        return node
//    }
//
//    //TODO we can not change the child back to the parent. And if you use copies, the context is lost.
//    override fun replaceNodeIfPossible(file: PsiFile, node: ASTNode, replacement: ASTNode): Boolean {
//        if (node.text.isEmpty() || node == replacement) return checkTest(file.text, file.name)
//
//        //If we trying to replace parent node to it child
//        if (node.getAllChildrenNodes().contains(replacement)) {
//            val backup = node.copyElement()
//            node.replaceThis(replacement)
//            if (!checkTest(file.text, file.name)) {
//                log.debug("REPLACING BACK")
//                replacement.replaceThis(backup)
//            } else {
//                log.debug("SUCCESSFUL DELETING")
//                return true
//            }
//        }
//
//        //Else
//        for (p in node.getAllParentsWithoutNode()) {
//            try {
//                val oldText = file.text
//                p.replaceChild(node, replacement)
//                if (oldText == file.text)
//                    continue
//                if (!checkTest(file.text, file.name)) {
//                    log.debug("REPLACING BACK")
//                    p.replaceChild(replacement, node)
//                    return false
//                } else {
//                    log.debug("SUCCESSFUL DELETING")
//                    return true
//                }
//            } catch (e: AssertionError) {
//                log.debug("Exception while deleting ${node.text} from $p")
//            }
//        }
//        return false
//    }
//
//    fun checkErrsMatching(a: String, b: String): Double {
//        val diffs = patch.diffMain(a, b)
//        var sameNum = 0
//        var difNum = 0
//        for (dif in diffs) {
//            when (dif.operation.name) {
//                "EQUAL" -> sameNum += dif.text.length
//                else -> difNum += dif.text.length
//            }
//        }
//        return if (sameNum == 0) Double.MAX_VALUE else difNum.toDouble() / sameNum.toDouble()
//    }
//
//    override fun checkTest(text: String): Boolean = checkTest(text, pathToFile)
//
//    override fun checkTest(text: String, pathToFile: String): Boolean {
//        val hash = text.hashCode()
//        if (alreadyChecked.containsKey(hash)) {
//            log.debug("ALREADY CHECKED!!!")
//            return alreadyChecked[hash]!!
//        }
//        //Check for syntax correctness
//        if (psiFactory.createFile(text).node.getAllChildrenNodes().any { it.psi is PsiErrorElement }) {
//            log.debug("Not correct syntax")
//            alreadyChecked[hash] = false
//            return false
//        }
//        val oldText = File(pathToFile).bufferedReader().readText()
//        var writer = File(pathToFile).bufferedWriter()
//        writer.write(text)
//        writer.close()
//        val status = backend!!.tryToCompile(compilingPath)
////        var msg: String = ""
////        if (CompilerArgs.isCompilerError)
////            msg = tryToCompile().combinedOutput
////        else
////            msg = tryToCompileWithScript()
//        writer = File(pathToFile).bufferedWriter()
//        writer.write(oldText)
//        writer.close()
//        alreadyChecked[hash] = status.hasException
////        val k = checkErrsMatching(msg, errs)
////        log.debug("Koef = $k")
//
////        val error = Error(msg)
////        val inError = Error(errs)
////        val sec = error.type == inError.type
////        log.debug("CHECKING $pathToFile \n $compilingPath \n $text IS ERRORS SAME ${sec == (k < threshold)} $sec ${k < threshold}")
////        //X3!!
////        if (inError.type == ErrorType.UNKNOWN) {
////            alreadyChecked[hash] = (k < threshold)
////            return (k < threshold)
////        } else {
////            alreadyChecked[hash] = (error.type == inError.type)
////            return error.type == inError.type
////        }
//        return status.hasException
//    }
//
//    override fun checkTest(tree: List<ASTNode>): Boolean {
//        if (tree.isEmpty()) return false
//        val text = StringBuilder()
//        for (el in tree)
//            text.append(el.text)
//        log.debug("Checking : $text")
//        return checkTest(text.toString())
//    }


//    private fun tryToCompileWithScript(): String {
//        val p = ProcessBuilder("/bin/bash", "-c", "/home/stepanov/Kotlin/DynProj/test.sh").start()
//        p.waitFor()
//        val reader = BufferedReader(FileReader("/home/stepanov/trash/tmp.txt"))
//        return reader.readText()
//    }


//    //Fast check for compiling
//    private fun tryToCompile(): KotlincInvokeStatus {
//        val threadPool = Executors.newCachedThreadPool()
//        val args = "$compilingPath -cp ${System.getProperty("java.class.path")} -d trash/".split(" ")
//        val compiler = K2JVMCompiler()
//        val compilerArgs = K2JVMCompilerArguments().apply { K2JVMCompiler().parseArguments(args.toTypedArray(), this) }
////        compilerArgs.classpath = "/home/stepanov/Kotlin/testProjects/github/kotoed/kotoed-server-0.1.0-SNAPSHOT-fat.jar"
//        if (CompilerArgs.classpath.isNotEmpty())
//            compilerArgs.classpath = CompilerArgs.classpath
//        compilerArgs.jdkHome = CompilerArgs.jdkHome
//        compilerArgs.jvmTarget = CompilerArgs.jvmTarget
//        IncrementalCompilation.setIsEnabledForJvm(true)
//
//        val services = Services.EMPTY
//
//        MsgCollector.clear()
//        val futureExitCode = threadPool.submit {
//            compiler.exec(MsgCollector, services, compilerArgs)
//        }
//        var hasTimeout = false
//        if (!CompilerArgs.isProject) {
//            try {
//                futureExitCode.get(10L, TimeUnit.SECONDS)
//            } catch (ex: TimeoutException) {
//                hasTimeout = true
//            }
//        } else {
//            while (!futureExitCode.isDone) {
//            }
//        }
//
////        val st = KotlincInvokeStatus(msgCollector.crashMessages.joinToString("\n") +
////                msgCollector.compileErrorMessages.joinToString("\n"),
////                !msgCollector.hasCompileError,
////                msgCollector.hasException,
////                hasTimeout)
////        println("st = ${st.combinedOutput}")
////        System.exit(0)
//        return KotlincInvokeStatus(MsgCollector.crashMessages.joinToString("\n") +
//                MsgCollector.compileErrorMessages.joinToString("\n"),
//                !MsgCollector.hasCompileError,
//                MsgCollector.hasException,
//                hasTimeout)
//    }


//    override fun init(compilingPath: String, psiFactory: KtPsiFactory?): Error {
//        psiFactory?.let { this.psiFactory = it }
//        this.compilingPath = compilingPath
//        val status = backend!!.tryToCompile(compilingPath)
//        require(status.hasException) { "File has not contains bug for current version of kotlin compiler" }
//        errs = status.combinedOutput
////        if (CompilerArgs.isCompilerError)
////            errs = tryToCompile().combinedOutput
////        else
////            errs = tryToCompileWithScript()
////        println("er = ${errs}")
////        val errorInfo = Error(errs)
//        if (CompilerArgs.isProject)
//            this.pathToFile = Error.pathToFile
//        else {
//            this.pathToFile = compilingPath
//            Error.initPath(compilingPath)
//        }
//        return Error("")
//    }
//
//    override fun reinit(): Error {
//        init(compilingPath)
//        return Error(errs)
//    }
//
//    override fun getErrorInfo(): Error =
//        Error(errs)
//    override fun getErrorMessage(): String = errs
//
//
//    lateinit var compilingPath: String
//    override lateinit var pathToFile: String
//    lateinit var psiFactory: KtPsiFactory
//    private lateinit var errs: String
//
//    private val log = Logger.getLogger("reducerLogger")
//    private val patch = DiffMatchPatch()
//    private val threshold = 0.5
//    override var alreadyChecked = HashMap<Int, Boolean>()
//
//}