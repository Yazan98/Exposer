package exposer.errors.network

import exposer.errors.ExposerException
import exposer.models.ExposerExceptionState
import exposer.models.ExposerNetworkError

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:31 AM
 * Project Name : IntelliJ IDEA
 */
abstract class ExposerNetworkException : ExposerException() {

    /**
     * This Method Should Provide The Exception With The Common Message About This Type Of Error
     */
    abstract fun getExceptionMessage(): String

    /**
     * This Should Return The Key About This Error
     */
    abstract fun getErrorState(): ExposerExceptionState

    /**
     * This Method Should Provide The Parent Layer The IN_COMING Key
     * Like If You Need To Display An Arabic Message From The Exception return 0
     * If You Need To Display English Message return 1 For Example
     */
    abstract fun getExceptionUniqueKey(): Int

    /**
     * Return The Base Message
     */
    override val message: String?
        get() = getExceptionMessage()

    override fun getMainReason(): Any? {
        return ExposerNetworkError(
            getExceptionUniqueKey(),
            getErrorState(),
            getExceptionMessage()
        )
    }

}
