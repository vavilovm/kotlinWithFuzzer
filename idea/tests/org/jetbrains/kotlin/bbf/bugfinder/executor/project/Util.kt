package org.jetbrains.kotlin.bbf.bugfinder.executor.project

internal fun getCommentSection(text: String) =
    text.lineSequence()
        .takeWhile { it.startsWith("//") || it.trim().isEmpty() }
        .joinToString("\n")