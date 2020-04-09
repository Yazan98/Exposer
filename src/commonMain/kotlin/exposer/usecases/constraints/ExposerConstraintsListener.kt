package exposer.usecases.constraints

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:36 AM
 * Project Name : IntelliJ IDEA
 */

interface ExposerConstraintsListener {

    fun onSuccessConstraints(items: List<ExposerConstraint>)

    fun onFailedConstraints(items: List<ExposerConstraint>)

}
