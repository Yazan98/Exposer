package exposer.errors

import exposer.models.ExposerConstraintError

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 5:01 AM
 * Project Name : IntelliJ IDEA
 */

class ExposerUseCaseCancelationException(
    private val reason: Any?
) : ExposerException() {

    override val message: String?
        get() = reason.toString() ?: ""

    override fun getMainReason(): Any? {
        return reason
    }

}
