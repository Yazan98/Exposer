package exposer.errors

/**
 * Name : Yazan98
 * Date : 4/9/2020
 * Time : 3:30 AM
 * Project Name : IntelliJ IDEA
 */

abstract class ExposerException : Exception() {

    init {
        println("""
            Exposer Exception Started ...
            Exception From Domain Layer
            Exception Details : $message
        """.trimIndent())
    }

    override val message: String?
        get() = getMainReason().toString()

    protected abstract fun getMainReason(): Any?

}
