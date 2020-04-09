package exposer.usecases.constraints

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:01 AM
 * Project Name : IntelliJ IDEA
 */

abstract class ExposerConstraint<ExecutionType> {

    protected abstract fun isConstraintKillable(): Boolean
    protected abstract fun isConstraintDependable(): Boolean
    protected abstract fun canExecute(params: ExecutionType?): Boolean

}
