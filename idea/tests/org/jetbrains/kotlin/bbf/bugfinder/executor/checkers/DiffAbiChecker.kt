package org.jetbrains.kotlin.bbf.bugfinder.executor.checkers

import org.jetbrains.kotlin.bbf.bugfinder.executor.CommonCompiler
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.BBFFile
import org.jetbrains.kotlin.bbf.bugfinder.executor.project.Project
import org.jetbrains.kotlin.bbf.bugfinder.manager.BugType

class DiffAbiChecker (
    override val project: Project,
    override var curFile: BBFFile,
    private val compilers: List<CommonCompiler>
) : MultiCompilerCrashChecker(project, curFile, null, BugType.DIFFBEHAVIOR) {

    companion object {
        var td = 0
    }

//    override fun checkTest(): Boolean {
//
//    }

}

