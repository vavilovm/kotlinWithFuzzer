package org.jetbrains.kotlin.bbf.reduktor.executor.backends

import org.jetbrains.kotlin.bbf.reduktor.executor.KotlincInvokeStatus

interface CommonBackend {
    fun tryToCompile(path: String): KotlincInvokeStatus
}