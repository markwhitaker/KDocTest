package uk.co.mainwave.kdoctest

import android.util.Log

/**
 * A base class for doing stuff
 */
open class BaseClass {
    /**
     * Output a [message] using [Log.d]
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
}
