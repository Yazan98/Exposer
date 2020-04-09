package exposer.rx.usecases

import exposer.usecases.ExposerUseCaseParam
import exposer.usecases.ExposerUseCaseResult
import io.reactivex.Single

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 5:41 AM
 * Project Name : IntelliJ IDEA
 */
abstract class ExposerSingleUseCase<Result> : ExposerUseCaseResult<Single<Result>>()
abstract class ExposerSingleParamUseCase<Result, in Param> : ExposerUseCaseParam<Result, Param>()
    