package exposer.local

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 4:49 AM
 * Project Name : IntelliJ IDEA
 */
interface ExposerRequestRepository<Request> {

    fun addRxLocalRequest(request: Request)

    suspend fun addRxRequest(request: Request)

    fun clear()

}