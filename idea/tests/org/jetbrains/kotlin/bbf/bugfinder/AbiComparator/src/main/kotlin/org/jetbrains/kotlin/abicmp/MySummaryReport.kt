package org.jetbrains.kotlin.abicmp

import org.jetbrains.kotlin.abicmp.reports.SummaryReport
import java.io.File

object MySummaryReport {
    val summary = SummaryReport()

    fun writeSummary() {
        val reportDir = "./bbfgradle/tmp/"
        val summaryFile = File(reportDir, "SUMMARY.html")
        println("Writing summary: $summaryFile")
        summary.writeReport(summaryFile)
        println("Done, ${summary.totalDefects()} defects, ${summary.totalUnique()} unique")
    }


}