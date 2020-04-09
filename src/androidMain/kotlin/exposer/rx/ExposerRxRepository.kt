package exposer.rx

import exposer.rx.impl.ExposerRepositoryImpl
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:21 AM
 * Project Name : IntelliJ IDEA
 */

class ExposerRxRepository : ExposerRepositoryImpl {

    private val repository: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun addRxLocalRequest(request: Disposable) {
        this.repository += request
    }

    override suspend fun addRxRequest(request: Disposable) {
        withContext(Dispatchers.IO) {
            repository += request
        }
    }

    override fun clear() {
        repository.clear()
    }

}

private operator fun CompositeDisposable.plusAssign(request: Disposable) {
    add(request)
}
