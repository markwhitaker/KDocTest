package uk.co.mainwave.kdoctest

import android.util.Log

/**
 * A base class for doing stuff
 */
open class BaseClass {
    /**
     * Output a [message] using [Log.d]
     *
     * This is a further description of this method, in much more detail
     */
    open fun logMessage(message: String) {
        Log.d("BaseClass", message)
    }

    /**
     * Try to log but balls it right up
     *
     * @throws IllegalStateException We did warn you
     */
    fun logBadly() {
        throw IllegalStateException()
    }

    /**
     * This method is internal
     */
    internal fun internalMethod() {
        protectedMethod()
    }

    /**
     * This method is protected
     */
    protected fun protectedMethod() {
        privateMethod()
    }

    /**
     * This method is private
     */
    private fun privateMethod() {
    }

    /**
     * A method with Javadoc-style tags in its KDoc.
     *
     * This method is documented pretty extensively. It uses Javadoc-style tags to document its parameters, return value
     * and exception. It has a summary and a full description (which you're reading right now).
     *
     * It's basically the bee's knees.
     *
     * @param string A nullable string parameter
     * @param int An int parameter
     * @return The two parameters concatenated into a new string
     * @throws NullPointerException [string] was null
     */
    fun veryWellDocumentedMethod(string: String?, int: Int): String {
        if (string == null) {
            throw NullPointerException()
        }
        return "$string: $int"
    }
}
