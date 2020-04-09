package exposer.usecases.base

import exposer.usecases.constraints.ExposerConstraint

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

    /**
     * Cancel The UseCase At AnyTime
     * Each UseCase Has execute Method And You Can Execute The Request From This Method
     * And Any Execute Call Should Executes On The UseCase Job And You Can Cancel The Job Execution at AnyTime
     */
    fun cancel()

    /**
     * Cancel The UseCase At AnyTime
     * Each UseCase Has execute Method And You Can Execute The Request From This Method
     * And Any Execute Call Should Executes On The UseCase Job And You Can Cancel The Job Execution at AnyTime
     *
     * Here You Can Choose The UseCase Reason Why it's Canceled
     */
    fun cancelWithReason(reason: String)

    /**
     * Each UseCase Has Constraints In This Method You Can Provide The Constraints
     * What is Constraint ? ::: Check The ExposerConstraint Comment
     */
    fun getSupportedConstraints(): List<ExposerConstraint<Any?>>

    /**
     * You Should Always Implement The Constraints But You Can Provide The UseCase that can Execute The Request
     * With / Without Constraints Validation
     */
    fun isConstraintsSupported(): Boolean

    /**
     * Each UseCase Has Validation On Params And There Are UseCases That don't Require Params
     * To Execute The Request and This Method Should Lock The Validation When Params Not Found
     */
    fun isValidationEnabled(): Boolean

}

interface ExposerUseCaseParamImpl<Result, in Param> : ExposerBaseUseCase {

    /**
     * You Can Start UseCase Execution Here
     */
    suspend fun execute(param: Param): ExposerResult<Result>

    /**
     * This Method Should Execute When You Create The UseCase to Build And Check The Constraints Validation
     */
    fun build(param: Param): ExposerResult<Result>

    /**
     * Here You Can Get The Result From Callback When Execute The UseCase
     * And You Should Implement The Execute Method With try , Catch To Handle
     * The In Coming Exceptions
     */
    fun executeWithCallback(callback: ExposerUseCaseCallback<Result>)

}

interface ExposerUseCaseResultImpl<Result> : ExposerBaseUseCase {

    /**
     * You Can Start UseCase Execution Here
     */
    fun execute(): ExposerResult<Result>

    /**
     * This Method Should Execute When You Create The UseCase to Build And Check The Constraints Validation
     */
    fun build(): ExposerResult<Result>

}
