package exposer.errors.network

import exposer.models.ExposerExceptionState

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:40 AM
 * Project Name : IntelliJ IDEA
 */
class ExposerAutherizationException(
    private val cancelationReason: Any?,
    private val uniqueKey: Int
) : ExposerNetworkException() {

    override fun getExceptionMessage(): String = cancelationReason.toString() ?: ""
    override fun getErrorState(): ExposerExceptionState = ExposerExceptionState.UNAUTHRIZED
    override fun getExceptionUniqueKey(): Int = uniqueKey

}
