package exposer.usecases.base

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:22 AM
 * Project Name : IntelliJ IDEA
 */

interface ExposerThreadProvider<SchedularType> {

    fun getBackgroundThread(): SchedularType

    fun getMainThread(): SchedularType

    fun getNewThread(): SchedularType

}
