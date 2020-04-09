package exposer.rx.usecases

import exposer.usecases.ExposerUseCaseParam
import exposer.usecases.ExposerUseCaseResult
import io.reactivex.Observable

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:40 AM
 * Project Name : IntelliJ IDEA
 */
abstract class ExposerObservableUseCase<Result> : ExposerUseCaseResult<Observable<Result>>()
abstract class ExposerObservableParamUseCase<Result, in Param> : ExposerUseCaseParam<Result, Param>()
