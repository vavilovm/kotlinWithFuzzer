package com.stepanov.bbf.bugfinder


import com.intellij.openapi.application.ApplicationManager
import com.stepanov.bbf.IntentionTestClass
import com.stepanov.bbf.bugfinder.executor.CompilerArgs
import com.stepanov.bbf.bugfinder.executor.checkers.MutationChecker
import com.stepanov.bbf.bugfinder.executor.compilers.JVMCompiler
import com.stepanov.bbf.bugfinder.executor.project.Project
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

    val text = "val text = \"\"\"// WITH_RUNTIME\n" +
            "// INTENTION_TEXT: \"Replace with 'firstOrNull{}'\"\n" +
            "// IS_APPLICABLE_2: false\n" +
            "fun foo(array: Array<String>): String? {\n" +
            "    for (s in array) {\n" +
            "        if (s.isNotBlank()) {\n" +
            "            return s\n" +
            "        }\n" +
            "    }\n" +
            "    return null\n" +
            "}\n"
    val intentionTest = IntentionTestClass(text)


    val file = File(CompilerArgs.baseDir).listFiles()?.random() ?: exitProcess(0)
    SingleFileBugFinder(file.absolutePath).findBugsInFile()
    exitProcess(0)





    exitProcess(0)
}