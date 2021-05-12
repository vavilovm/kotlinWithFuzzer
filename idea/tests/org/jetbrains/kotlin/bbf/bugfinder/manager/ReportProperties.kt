package org.jetbrains.kotlin.bbf.bugfinder.manager

import org.jetbrains.kotlin.bbf.reduktor.util.ReduKtorProperties
import java.io.File
import java.util.*

object ReportProperties {

    private val file = File("bbf.conf")

    fun getPropValue(name: String): String? {
        val props = Properties()
        props.load(file.inputStream())
        return props.getProperty(name)
    }

    fun getPropAsBoolean(name: String): Boolean? = ReduKtorProperties.getPropValue(name)?.toBoolean()
}