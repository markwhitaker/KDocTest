package uk.co.mainwave.kdoctest

/**
 * A subclass that extends [BaseClass]
 */
class SubClass : BaseClass() {
    override fun logMessage(message: String) {
        super.logMessage("$message (from SubClass)")
    }
}
