package exposer.rx.impl

import io.reactivex.disposables.Disposable

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:23 AM
 * Project Name : IntelliJ IDEA
 */

interface ExposerRepositoryImpl {

    fun addRxLocalRequest(request: Disposable)

    suspend fun addRxRequest(request: Disposable)

    fun clear()

}
