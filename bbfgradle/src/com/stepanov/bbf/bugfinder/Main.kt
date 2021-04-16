package com.stepanov.bbf.bugfinder


import com.stepanov.bbf.bugfinder.executor.CompilerArgs
import com.stepanov.bbf.bugfinder.util.FalsePositivesDeleter
import com.stepanov.bbf.bugfinder.util.NodeCollector
import net.sourceforge.argparse4j.ArgumentParsers
import net.sourceforge.argparse4j.impl.Arguments
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.log4j.PropertyConfigurator
import java.io.File
import kotlin.system.exitProcess


fun main(args: Array<String>) {
    //Init log4j
    PropertyConfigurator.configure("./bbfgradle/resources/bbfLog4j.properties")
    if (!CompilerArgs.getPropAsBoolean("LOG")) {
        Logger.getRootLogger().level = Level.OFF
        Logger.getLogger("bugFinderLogger").level = Level.OFF
        Logger.getLogger("mutatorLogger").level = Level.OFF
        Logger.getLogger("reducerLogger").level = Level.OFF
        Logger.getLogger("transformationManagerLog").level = Level.OFF
    }
    val parser = ArgumentParsers.newFor("bbf").build()
    parser.addArgument("-r", "--reduce")
        .required(false)
        .help("Reduce mode")
    parser.addArgument("-f", "--fuzz")
        .required(false)
        .help("Fuzzing mode")
    parser.addArgument("-c", "--clean")
        .required(false)
        .action(Arguments.storeTrue())
        .help("Clean directories with bugs from bugs that are not reproduced")
    parser.addArgument("-d", "--database")
        .required(false)
        .action(Arguments.storeTrue())
        .help("Database updating")
    val arguments = parser.parseArgs(args)
    arguments.getString("reduce")?.let {
        //TODO
        exitProcess(0)
    }
    arguments.getString("fuzz")?.let {
        require(File(it).isDirectory) { "Specify directory to take files for mutation" }
        val file = File(it).listFiles()?.random() ?: throw IllegalArgumentException("Wrong directory")
        SingleFileBugFinder(file.absolutePath).findBugsInFile()
        exitProcess(0)
    }
    if (arguments.getString("database") == "true") {
        NodeCollector(CompilerArgs.baseDir).collect()
        exitProcess(0)
    }
    if (arguments.getString("clean") == "true") {
        FalsePositivesDeleter().cleanDirs()
        exitProcess(0)
    }

    val text = """
fun foo(array: Array<String>): String? {
    for (s in array) {
        if (s.isNotBlank()) 
            return s
       
    }
    return null
}
"""

//
//    for (i in 1..10) {
//        val intentionTest = IntentionTestClass(text)
//        val length = text.length
//        println(text)
//
//        val app = ApplicationManager.getApplication()
//        app.invokeAndWait {
//            for (intention in intentionTest.intentions) {
//                println(intention.text)
//                var posExecuted = -1;
//                for (pos in 0..length - 1) {
//                    val newCode = intentionTest.runIntentionInPos(intention, pos)
//                    if (newCode != null) {
//                        posExecuted = pos
////                        checkTraces(Project.createFromCode(newCode))
////                    checkTracesOnTmpProject(Project.createFromCode(newCode))
//                    }
//                }
//                println(posExecuted)
//            }
//
//        }
//        println("exit")
//        intentionTest.tearDown()
//        println("exited")
//    }


    for (i in 1..10) {
        val file = File(CompilerArgs.baseDir).listFiles()?.random() ?: exitProcess(0)
        println(file.absolutePath)
        SingleFileBugFinder(file.absolutePath).findBugsInFile()
    }

    exitProcess(0)


}