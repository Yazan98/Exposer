package exposer.local

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 12:20 AM
 * Project Name : IntelliJ IDEA
 */

interface ExposerMemoryRepositoryImpl<Type: Any> {

    fun add(key: String, value: Type)

    fun addAll(items: HashMap<String, Type>)

    fun withListener(listener: ExposerMemoryListener<Type>)

    fun destroyListener()

    fun getByKey(key: String): Type

    fun save(key: String, value: Any)

    fun execute()

}
