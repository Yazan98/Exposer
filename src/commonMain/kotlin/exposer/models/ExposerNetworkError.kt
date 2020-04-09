package exposer.models

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:05 AM
 * Project Name : IntelliJ IDEA
 */
data class ExposerNetworkError(
    val key: Int,
    val state: ExposerExceptionState,
    val message: String
)