package uk.co.mainwave.kdoctest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * The main activity, that uses [SubClass] to do its thing
 */
class MainActivity : AppCompatActivity() {

    /**
     * [Android framework method](https://developer.android.com/guide/components/activities/activity-lifecycle)
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subClass = SubClass()
        subClass.logMessage("Hello world")
        subClass.logBadly()

        subClass.internalMethod()
    }
}
