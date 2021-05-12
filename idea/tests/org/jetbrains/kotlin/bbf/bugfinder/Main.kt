package org.jetbrains.kotlin.bbf.bugfinder

import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFileFactory
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Header
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.getCommentSection
import org.jetbrains.kotlin.bbf.bugfinder.util.FalsePositivesDeleter
import org.jetbrains.kotlin.bbf.bugfinder.util.NodeCollector
import net.sourceforge.argparse4j.ArgumentParsers
import net.sourceforge.argparse4j.impl.Arguments
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.log4j.PropertyConfigurator
import org.junit.runner.JUnitCore
import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    //Init log4j
//    PropertyConfigurator.configure("./bbfgradle/resources/bbfLog4j.properties")
//    if (!CompilerArgs.getPropAsBoolean("LOG")) {
//        Logger.getRootLogger().level = Level.OFF
//        Logger.getLogger("bugFinderLogger").level = Level.OFF
//        Logger.getLogger("mutatorLogger").level = Level.OFF
//        Logger.getLogger("reducerLogger").level = Level.OFF
//        Logger.getLogger("transformationManagerLog").level = Level.OFF
//    }
//    val parser = ArgumentParsers.newFor("bbf").build()
//    parser.addArgument("-r", "--reduce")
//        .required(false)
//        .help("Reduce mode")
//    parser.addArgument("-f", "--fuzz")
//        .required(false)
//        .help("Fuzzing mode")
//    parser.addArgument("-c", "--clean")
//        .required(false)
//        .action(Arguments.storeTrue())
//        .help("Clean directories with bugs from bugs that are not reproduced")
//    parser.addArgument("-d", "--database")
//        .required(false)
//        .action(Arguments.storeTrue())
//        .help("Database updating")
//    val arguments = parser.parseArgs(args)
//    arguments.getString("reduce")?.let {
//        //TODO
//        exitProcess(0)
//    }
//    arguments.getString("fuzz")?.let {
//        require(File(it).isDirectory) { "Specify directory to take files for mutation" }
//        val file = File(it).listFiles()?.random() ?: throw IllegalArgumentException("Wrong directory")
//        SingleFileBugFinder(file.absolutePath).findBugsInFile()
//        exitProcess(0)
//    }
//    if (arguments.getString("database") == "true") {
//        NodeCollector(CompilerArgs.baseDir).collect()
//        exitProcess(0)
//    }
//    if (arguments.getString("clean") == "true") {
//        FalsePositivesDeleter().cleanDirs()
//        exitProcess(0)
//    }
//
//    val text = """
//fun foo(array: Array<String>): String? {
//    for (s in array) {
//        if (s.isNotBlank())
//            return s
//
//    }
//    return null
//}
//"""
//
//
//    val junit = JUnitCore()

//    Result result = junit.run(testClasses);
//    val jUnitCore = JUnitCore()
//    jUnitCore.run()
//    ApplicationManager.getApplication()
//
//    val editorFactory = EditorFactory.getInstance()
//    val doc: Document = editorFactory.createDocument(text)
//    val editor = editorFactory.createEditor(doc)
//
//    val projectFactory = DefaultProjectFactory.getInstance()
//    val project = projectFactory.defaultProject
//
//    val psiDocManager = PsiDocumentManager.getInstance(project)
//    psiDocManager.commitDocument(doc)
//    psiDocManager.getPsiFile(doc)

//    com.intellij.psi.



//    val intentionTest1 = IntentionTestClass(text)
//    intentionTest1.tearDown()
//
//    val configuration = Header.createHeader(getCommentSection(text))
//    val files = BBFFileFactory(text, configuration).createBBFFiles()
//
//    println("run2")
//    val intentionTest2 = IntentionTestClass(text)
////    val text2 = intentionTest2.runIntentionInPos(intentionTest2.intentions[0], 91)
//    intentionTest2.tearDown()
//    println("exit")
//
//
//    println(Project.createFromCode(text))



//    println("ok thats all")


//    val app = ApplicationManager.getApplication()
//    val length = text.length
//    println(text)
//
//    app.invokeAndWait {
//        intentionTest.runIntentionInPos(intentionTest.intentions[0], 20)
//    }
//        for (intention in intentionTest.intentions) {
//            println(intention.text)
//            var posExecuted = -1;
//            for (pos in 0..length - 1) {
//                val newCode = intentionTest.runIntentionInPos(intention, pos)
//                if (newCode != null) {
//                    posExecuted = pos
////                        checkTraces(Project.createFromCode(newCode))
////                    checkTracesOnTmpProject(Project.createFromCode(newCode))
//                }
//            }
//            println(posExecuted)
//        }
//    }


//    val intentionTestClass2 = IntentionTestClass(text)
//    Project.createFromCode(text)

//    for (i in 1..10) {
//        val file = File(CompilerArgs.baseDir).listFiles()?.random() ?: exitProcess(0)
//        println(file.absolutePath)
//        SingleFileBugFinder(file.absolutePath).findBugsInFile()
//    }

    exitProcess(0)


}