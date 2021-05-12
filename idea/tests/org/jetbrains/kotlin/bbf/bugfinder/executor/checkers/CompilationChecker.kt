package org.jetbrains.kotlin.bbf.bugfinder.executor.checkers

import org.jetbrains.kotlin.bbf.bugfinder.executor.COMPILE_STATUS
import org.jetbrains.kotlin.bbf.bugfinder.executor.CommonCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.CompilerArgs
import org.jetbrains.kotlin.bbf.bugfinder.manager.Bug
import org.jetbrains.kotlin.bbf.bugfinder.manager.BugType
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.tracer.Tracer
import org.jetbrains.kotlin.abicmp.MySummaryReport
import org.jetbrains.kotlin.abicmp.tasks.JarTask
import org.jetbrains.kotlin.abicmp.tasks.checkerConfiguration
import java.io.File
import java.util.jar.JarFile

open class CompilationChecker(val compilers: List<CommonCompiler>) /*: Checker()*/ {

    constructor(compiler: CommonCompiler) : this(listOf(compiler))

    fun isCompilationSuccessful(project: Project): Boolean = compilers.all { it.checkCompiling(project) }

    fun compileAndGetMessage(project: Project): String = compilers.first().getErrorMessage(project)

    fun compileAndGetStatuses(project: Project): List<COMPILE_STATUS> =
        compilers.map { it.tryToCompileWithStatus(project) }

    fun checkTraces(project: Project): Boolean {
        val compilers = CompilerArgs.getCompilersList()
        val copyOfProject = project.copy()
        Tracer(compilers.first(), copyOfProject).trace()
        return TracesChecker(compilers).checkBehavior(copyOfProject)
    }

    fun checkTracesOnTmpProject(project: Project): Boolean {
        val compilers = CompilerArgs.getCompilersList()
        Tracer(compilers.first(), project).trace()
        return TracesChecker(compilers).checkBehavior(project)
    }

    //${Kostyl.name.substringBefore("_")}$index.jar"
    fun checkABI(project: Project): Pair<Int, File>? {
        val compilers = CompilerArgs.getCompilersList()
        if (compilers.size != 2) return null
        val compiled = compilers.mapIndexed { index, comp ->
            comp.pathToCompiled =
                comp.pathToCompiled.replace(".jar", "$index.jar")
                //comp.pathToCompiled.replace("tmp.jar", "${Kostyl.name.substringBefore("_")}$index.jar")
            comp.compile(project).pathToCompiled
        }
        if (compiled.any { it == "" }) return null
        val jars = compiled.map { JarFile(it) }
        val task =
            JarTask(
                "",
                jars.first(),
                jars.last(),
                compilers.first().compilerInfo,
                compilers.last().compilerInfo,
                File("./bbfgradle/tmp/report.html"),
                checkerConfiguration {}
            )
        val execRes = task.execute()
        MySummaryReport.summary.add(task.defectReport)
        return execRes
    }

    fun checkAndGetCompilerBugs(project: Project): List<Bug> {
        val res = mutableListOf<Bug>()
        compilers.forEach { compiler ->
            if (compiler.isCompilerBug(project)) {
                val msg = compiler.getErrorMessage(project)
                val type =
                    if (msg.contains("Exception while analyzing expression")) BugType.FRONTEND else BugType.BACKEND
                res.add(Bug(compiler, msg, project.copy(), type))
            }
        }
        if (res.size != 0) return res
        val compilersToStatus = compilers.map { it to it.checkCompiling(project) }
        val grouped = compilersToStatus.groupBy { it.first.compilerInfo.split(" ").first() }
        for (g in grouped) {
            if (g.value.map { it.second }.toSet().size != 1) {
                val diffCompilers =
                    g.value.groupBy { it.second }.mapValues { it.value.first().first }.values.toList()
                res.add(
                    Bug(diffCompilers, "", project.copy(), BugType.DIFFCOMPILE)
                )
            }
        }
        return res
    }


}