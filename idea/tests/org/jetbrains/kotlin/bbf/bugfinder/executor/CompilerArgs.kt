package org.jetbrains.kotlin.bbf.bugfinder.executor

import org.jetbrains.kotlin.bbf.bugfinder.executor.compilers.JSCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.compilers.JVMCompiler
import org.jetbrains.kotlin.bbf.bugfinder.util.BBFProperties
import org.apache.commons.io.IOUtils
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import java.util.jar.JarFile
import kotlin.streams.toList

object CompilerArgs {

    private val file: File = File("./bbfgradle/bbf.conf")
    val stdLibJars = Files.walk(Paths.get("dist"))
        .toList()
        .map { it.toFile() }
        .filter { it.name.endsWith(".jar") }
        .toList()

    fun getPropValue(name: String): String? {
        val props = Properties()
        props.load(file.inputStream())
        return props.getProperty(name)
    }

    fun getPropValueWithoutQuotes(name: String): String {
        val props = Properties()
        props.load(file.inputStream())
        val prop = props.getProperty(name) ?: throw IllegalArgumentException("Cannot init $name property")
        val res = prop.drop(1).dropLast(1)
        return res
    }

    fun getPropAsBoolean(name: String): Boolean = getPropValue(name)?.toBoolean()
        ?: throw IllegalArgumentException("Cannot init $name property")

    fun getStdLibPath(libToSearch: String): String {
        var pathToLib = stdLibJars.find { it.name == "$libToSearch.jar" }?.absolutePath
        if (pathToLib == null) {
            pathToLib = Files.walk(Paths.get("libraries/"))
                .toList()
                .map { it.toFile() }
                .filter { it.name.endsWith(".jar") }
                .toList()
                .find { it.name == "$libToSearch-1.5.255-SNAPSHOT.jar"}
                ?.absolutePath
        }
        require(pathToLib != null && pathToLib.isNotEmpty())
        return pathToLib
    }

    fun getAnnoPath(ver: String): String {
        val gradleDir = "${System.getProperty("user.home")}/.gradle/caches/modules-2/files-2.1/org.jetbrains/"
        val dir =
            File("$gradleDir/annotations").listFiles()?.find { it.isDirectory && it.name.trim() == ver }?.path ?: ""
        val pathToLib = File(dir).walkTopDown().find { it.name == "annotations-$ver.jar" }?.absolutePath ?: ""
        require(pathToLib.isNotEmpty())
        return pathToLib
    }

    private fun findAndSaveLib(name: String, jarFile: JarFile) {
        val lib = jarFile.entries().asSequence().first { it.name == name }
        val input = jarFile.getInputStream(lib)
        val content = IOUtils.toString(input, "UTF-8")
        File("./bbfgradle/tmp/lib/").mkdirs()
        File("./bbfgradle/tmp/lib/$name").writeText(content)
    }

    fun createJSLib(): String {
        val pathToJar = getStdLibPath("kotlin-stdlib-js")
        val jarFile = JarFile(File(pathToJar))
        findAndSaveLib("kotlin.js", jarFile)
        findAndSaveLib("kotlin.meta.js", jarFile)
        return "${System.getProperty("user.dir")}./bbfgradle/tmp/lib/"
    }

    fun getCompilersList(): List<CommonCompiler> {
        val compilers = mutableListOf<CommonCompiler>()
        //Init compilers
        val compilersConf = BBFProperties.getStringGroupWithoutQuotes("BACKENDS")
        compilersConf.filter { it.key.contains("JVM") }.forEach {
            compilers.add(
                JVMCompiler(
                    it.value
                )
            )
        }
        compilersConf.filter { it.key.contains("JS") }.forEach {
            compilers.add(
                JSCompiler(
                    it.value
                )
            )
        }
        return compilers
    }

    val baseDir = getPropValueWithoutQuotes("MUTATING_DIR")
    val javaBaseDir = getPropValueWithoutQuotes("JAVA_FILES_DIR")
    val dirForNewTests = "$baseDir/newTests"

    //PATHS TO COMPILERS
    val pathToJsKotlinLib = createJSLib()
    val pathToTmpFile = getPropValueWithoutQuotes("TMPFILE")
    val pathToTmpDir = pathToTmpFile.substringBeforeLast("/")

    //RESULT
    val resultsDir = getPropValueWithoutQuotes("RESULTS")

    //MODE
    val isMiscompilationMode = getPropAsBoolean("MISCOMPILATION_MODE")
    val isStrictMode = getPropAsBoolean("STRICT_MODE")

    //ABI
    val isABICheckMode = getPropAsBoolean("ABI_CHECK_MODE")
    val ignoreMissingClosureConvertedMethod = getPropAsBoolean("IGNORE_MISSING_CLOSURE_CONVERTED_METHOD")

    //ORACLE
    val useJavaAsOracle = getPropAsBoolean("USE_JAVA_AS_ORACLE")

    //MUTATED BUGS
    val shouldSaveCompilerBugs =
        getPropAsBoolean("SAVE_BACKEND_EXCEPTIONS")
    val shouldReduceCompilerBugs =
        getPropAsBoolean("REDUCE_BACKEND_EXCEPTIONS")
    val shouldSaveMutatedFiles = getPropAsBoolean("SAVE_MUTATED_FILES")
    val shouldSaveCompileDiff = getPropAsBoolean("SAVE_COMPILER_DIFFS")
    val shouldReduceDiffBehavior =
        getPropAsBoolean("REDUCE_DIFF_BEHAVIOR")
    val shouldReduceDiffCompile =
        getPropAsBoolean("REDUCE_DIFF_COMPILE")

    //REDUKTOR
    val shouldFilterDuplicateCompilerBugs =
        getPropAsBoolean("FILTER_DUPLICATES")

    //JAVA
    val jdkHome = System.getenv("JAVA_HOME")
    val jvmTarget = "1.8"
    val classpath = ""

    //STDLIB
    val jvmStdLibPaths = listOf(
        getStdLibPath("kotlin-stdlib"), getStdLibPath("kotlin-stdlib-common"),
        getStdLibPath("kotlin-test"), getStdLibPath("kotlin-test-common"), getStdLibPath("kotlin-reflect"),
        getStdLibPath("kotlin-script-runtime"), getStdLibPath("kotlin-test-junit")
        //getStdLibPath("kotlin-stdlib-jdk8"), getStdLibPath("kotlin-stdlib-jdk7")
    )

    val jsStdLibPaths = listOf(
        getStdLibPath("kotlin-stdlib-js"), getStdLibPath("kotlin-stdlib-common"),
        getStdLibPath("kotlin-test-common"), getStdLibPath("kotlin-test-js"), getStdLibPath("kotlin-reflect")
    )
    val pathToStdLibScheme = "./bbfgradle/tmp/lib/standardLibraryTree.txt"
}