@file:Suppress("INCOMPATIBLE_ENUM_COMPARISON")

package exposer.logger

import exposer.logger.config.ExposerLoggerConfiguration
import exposer.logger.keys.ExposerLoggerLevel
import exposer.logger.keys.ExposerLoggerMode
import exposer.logger.keys.ExposerLoggingStatus

/**
 * Name : Yazan98
 * Date : 4/8/2020
 * Time : 11:48 PM
 * Project Name : IntelliJ IDEA
 */

object ExposerLog {

    @PublishedApi internal var defaultPreMode: ExposerLoggerMode = ExposerLoggerConfiguration.getLoggingConfiguration().getDefaultPreMode()
    @PublishedApi internal var defaultPostMode: ExposerLoggerMode = ExposerLoggerConfiguration.getLoggingConfiguration().getDefaultPostMode()
    @PublishedApi internal var parentTag: String =  ExposerLoggerConfiguration.getLoggingConfiguration().getGlobalTag()
    @PublishedApi internal var defaultLevel: ExposerLoggerLevel = ExposerLoggerConfiguration.getLoggingConfiguration().getDefaultLevel()
    @PublishedApi internal var repeatTime: Int = 50

    inline fun print(message: String, body: () -> Unit = {}) {
        if (ExposerLoggerConfiguration.getLoggingConfiguration().getLoggingStatus() == ExposerLoggingStatus.ENABLED) {
            body()
            this printPreMode defaultPreMode
            println("Exposer Log : TAG [${parentTag}] ::: $message")
            this printPostMode defaultPostMode
            this resetOptionsAfterLog true
        }
    }

    inline fun printLevel(message: String, body: () -> Unit = {}) {
        if (ExposerLoggerConfiguration.getLoggingConfiguration().getLoggingStatus() == ExposerLoggingStatus.ENABLED) {
            body()
            this printPreMode defaultPreMode
            printLevelWithMessage(message, defaultLevel)
            this printPostMode defaultPostMode
            this resetOptionsAfterLog true
        }
    }

    infix fun preMode(mode: ExposerLoggerMode) {
        this.defaultPreMode = mode
    }

    infix fun postMode(mode: ExposerLoggerMode) {
        this.defaultPostMode = mode
    }

    infix fun currentTag(tag: String) {
        this.parentTag = tag
    }

    infix fun attachLevel(level: ExposerLoggerLevel) {
        this.defaultLevel = level
    }

    infix fun prePost(mode: ExposerLoggerMode) {
        this.defaultPreMode = mode
        this.defaultPostMode = mode
    }

    infix fun repeat(count: Int) {
        repeatTime = count
    }

    @PublishedApi internal fun printLevelWithMessage(message: String, mode: ExposerLoggerLevel) {
        when (mode) {
            ExposerLoggerLevel.DEBUG -> println("Exposer Log : [DEBUG] - TAG [${parentTag}] ::: ${message}")
            ExposerLoggerLevel.ERROR -> println("Exposer Log : [ERROR] - TAG [${parentTag}] ::: ${message}")
            ExposerLoggerLevel.WARNING -> println("Exposer Log : [WARNING] - TAG [${parentTag}] ::: ${message}")
        }
    }

    @PublishedApi internal infix fun printPreMode(mode: ExposerLoggerMode) {
        when (mode) {
            ExposerLoggerMode.DASH -> {
                for (i in 0..repeatTime) { print("-") }
                println()
            }
            ExposerLoggerMode.EQUAL -> {
                for (i in 0..repeatTime) { print("=") }
                println()
            }
            ExposerLoggerMode.SLASH -> {
                for (i in 0..repeatTime) { print("/") }
                println()
            }
            ExposerLoggerMode.STAR -> {
                for (i in 0..repeatTime) { print("*") }
                println()
            }
        }
    }

    @PublishedApi internal infix fun printPostMode(mode: ExposerLoggerMode) {
        when (mode) {
            ExposerLoggerMode.DASH -> {
                for (i in 0..repeatTime) { print("-") }
                println()
            }
            ExposerLoggerMode.EQUAL -> {
                for (i in 0..repeatTime) { print("=") }
                println()
            }
            ExposerLoggerMode.SLASH -> {
                for (i in 0..repeatTime) { print("/") }
                println()
            }
            ExposerLoggerMode.STAR -> {
                for (i in 0..repeatTime) { print("*") }
                println()
            }
        }
    }

    @PublishedApi internal infix fun resetOptionsAfterLog(resetMode: Boolean) {
        if (resetMode) {
            defaultPreMode = ExposerLoggerConfiguration.getLoggingConfiguration().getDefaultPreMode()
            defaultPostMode = ExposerLoggerConfiguration.getLoggingConfiguration().getDefaultPostMode()
            parentTag =  ExposerLoggerConfiguration.getLoggingConfiguration().getGlobalTag()
            repeatTime = 50
        }
    }
    
}