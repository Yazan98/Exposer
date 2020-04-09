package exposer.usecases.base

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:21 AM
 * Project Name : IntelliJ IDEA
 */

sealed class ExposerResult<Result> {

    class ExposerSuccessResult<Result>(private val result: Result) : ExposerResult<Result>() {
        fun getResultContent() = Result
    }

    class ExposerErrorResult<ErrorType>(private val error: ErrorType) : ExposerResult<ErrorType>() {
        fun getErrors() = error
    }

}
