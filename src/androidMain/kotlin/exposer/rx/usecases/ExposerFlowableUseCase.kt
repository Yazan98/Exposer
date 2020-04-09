package exposer.rx.usecases

import exposer.usecases.ExposerUseCaseParam
import exposer.usecases.ExposerUseCaseResult
import io.reactivex.Flowable

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 5:42 AM
 * Project Name : IntelliJ IDEA
 */
abstract class ExposerFlowableUseCase<Result> : ExposerUseCaseResult<Flowable<Result>>()
abstract class ExposerFlowableParamUseCase<Result, in Param> : ExposerUseCaseParam<Result, Param>()
