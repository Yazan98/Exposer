package exposer.logger.config

import exposer.logger.keys.ExposerLoggerLevel
import exposer.logger.keys.ExposerLoggerMode
import exposer.logger.keys.ExposerLoggingStatus

/**
 * Name : Yazan98
 * Date : 4/8/2020
 * Time : 11:50 PM
 * Project Name : IntelliJ IDEA
 */

interface ExposerBaseOptionsInitializer {

    fun getGlobalTag(): String

    fun getLoggingStatus(): ExposerLoggingStatus

    fun getDefaultPreMode(): ExposerLoggerMode

    fun getDefaultPostMode(): ExposerLoggerMode

    fun getDefaultLevel(): ExposerLoggerLevel

}
