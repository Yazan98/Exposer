package exposer.rx.usecases

import exposer.usecases.ExposerUseCaseParam
import exposer.usecases.ExposerUseCaseResult
import io.reactivex.Maybe

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 5:42 AM
 * Project Name : IntelliJ IDEA
 */
abstract class ExposerMaybeUseCase<Result> : ExposerUseCaseResult<Maybe<Result>>()
abstract class ExposerMaybeParamUseCase<Result, in Param> : ExposerUseCaseParam<Result, Param>()
