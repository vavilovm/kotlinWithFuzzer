package org.jetbrains.kotlin.bbf.kootstrap.util

/**
 * Created by akhin on 11/7/16.
 */

inline fun <R> function(body: () -> R) = body()
