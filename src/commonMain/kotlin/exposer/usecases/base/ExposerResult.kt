package exposer.usecases.base

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:21 AM
 * Project Name : IntelliJ IDEA
 */

sealed class ExposerResult<Result> {

    class ExposerSuccessResult<Result> : ExposerResult<Result>()
    class ExposerErrorResult<ErrorType> : ExposerResult<ErrorType>()

}
