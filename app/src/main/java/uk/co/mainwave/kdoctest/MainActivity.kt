package uk.co.mainwave.kdoctest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * The main activity, that uses [SubClass] to do its thing
 */
class MainActivity : AppCompatActivity() {

    /**
     * @inheritDoc
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subClass = SubClass()
        subClass.logMessage("Hello world")
        subClass.logBadly()

        internalMethod()
        protectedMethod()
        privateMethod()
    }

    /**
     * This method is internal
     */
    internal fun internalMethod() {
    }

    /**
     * This method is protected
     */
    protected fun protectedMethod() {
    }

    /**
     * This method is private
     */
    private fun privateMethod() {
    }
}
