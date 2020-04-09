package exposer.errors.network

import exposer.models.ExposerExceptionState

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:36 AM
 * Project Name : IntelliJ IDEA
 */

open class ExposerNotFoundException(
    private val cancelationReason: Any?,
    private val uniqueKey: Int
) : ExposerNetworkException() {

    override fun getExceptionMessage(): String = cancelationReason.toString() ?: ""
    override fun getErrorState(): ExposerExceptionState = ExposerExceptionState.NOT_FOUND
    override fun getExceptionUniqueKey(): Int = uniqueKey

}
