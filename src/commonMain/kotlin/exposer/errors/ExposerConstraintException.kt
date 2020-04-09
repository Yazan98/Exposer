package exposer.errors

import exposer.models.ExposerConstraintError

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:02 AM
 * Project Name : IntelliJ IDEA
 */
class ExposerConstraintException(
    private val cancellationReasons: List<Any>,
    private val mainReason: Any?
) : ExposerException() {

    override val message: String?
        get() = mainReason.toString() ?: ""

    override fun getMainReason(): Any? {
        return ExposerConstraintError(
            cancellationReasons,
            mainReason.toString()
        )
    }

}
