package exposer.errors.network

import exposer.models.ExposerExceptionState

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:53 AM
 * Project Name : IntelliJ IDEA
 */
class ExposerUnknownHostException(
    private val cancelationReason: Any?,
    private val uniqueKey: Int
) : ExposerNetworkException() {

    override fun getExceptionMessage(): String = cancelationReason.toString() ?: ""
    override fun getErrorState(): ExposerExceptionState = ExposerExceptionState.UNKNOWN_HOST_ERROR
    override fun getExceptionUniqueKey(): Int = uniqueKey

}
