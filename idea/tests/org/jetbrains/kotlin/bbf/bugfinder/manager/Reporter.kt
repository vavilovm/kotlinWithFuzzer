package org.jetbrains.kotlin.bbf.bugfinder.manager

interface Reporter {
    fun dump(bugs: List<Bug>)
}