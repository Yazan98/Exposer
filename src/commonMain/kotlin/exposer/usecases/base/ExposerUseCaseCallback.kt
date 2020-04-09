package exposer.usecases.base

import exposer.usecases.constraints.ExposerConstraint

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 5:23 AM
 * Project Name : IntelliJ IDEA
 */
interface ExposerUseCaseCallback<Result> {

    suspend fun onResult(result: Result)

    suspend fun onError(error: Throwable)

    suspend fun onConstraintsError(items: List<ExposerConstraint<*>>)

    suspend fun onCanceled(reason: String)

}