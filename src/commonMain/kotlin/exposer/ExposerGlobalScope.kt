package exposer

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:13 AM
 * Project Name : IntelliJ IDEA
 */

object ExposerGlobalScope : CoroutineScope {

    private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Default + SupervisorJob()

    fun destroyScope() {
        scope.cancel()
    }

    fun destroyScope(error: CancellationException) {
        scope.cancel(error)
    }

}
