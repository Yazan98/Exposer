package exposer.usecases.base

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:19 AM
 * Project Name : IntelliJ IDEA
 */

interface ExposerBaseUseCase {

    /**
     * This Should Save The Api Requests When Handle It To The UseCase Store
     * For Example RxJava With Observable Should Apply The Disposable To CompositDisposable
     * You Can Submit Any Type Of Request With Observable, Single, Flowable, Maybe, Etc
     * This TestCase For Android
     */
    fun acceptNewAction(value: Any)

    /**
     * When You Need To Destroy The UseCase
     * You Can Clean The Requests Once Finished From The UseCase
     */
    fun destroy()

}

interface ExposerUseCaseParamImpl<Result, in Param> : ExposerBaseUseCase {

    fun execute(param: Param): ExposerResult<Result>

    fun build(param: Param): ExposerResult<Result>

}

interface ExposerUseCaseResultImpl<Result> : ExposerBaseUseCase {

    fun execute(): ExposerResult<Result>

    fun build(): ExposerResult<Result>

}
