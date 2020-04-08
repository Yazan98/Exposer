package exposer.logger.config

import exposer.errors.ExposerLoggerInitException

/**
 * Name : Yazan98
 * Date : 4/8/2020
 * Time : 11:51 PM
 * Project Name : IntelliJ IDEA
 */

object ExposerLoggerConfiguration {

    private lateinit var loggerConfiguration: ExposerBaseOptionsInitializer
    fun init(options : ExposerBaseOptionsInitializer) {
        loggerConfiguration = options
    }

    fun getLoggingConfiguration(): ExposerBaseOptionsInitializer {
        return if (::loggerConfiguration.isInitialized) {
            loggerConfiguration
        } else {
            throw ExposerLoggerInitException()
        }
    }
    
}
