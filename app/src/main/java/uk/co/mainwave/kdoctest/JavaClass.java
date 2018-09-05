package uk.co.mainwave.kdoctest;

/**
 * This is a Java class, obviously
 */
public class JavaClass {
    /**
     * Convert an integer to a string (yes, I know)
     * @param a The integer to convert
     * @return The integer as a string
     * @throws IllegalStateException The integer is < 0 (yes, I know)
     */
    public String convertToString(final int a) {
        if (a < 0) {
            throw new IllegalStateException("Not having that, mate");
        }
        return String.valueOf(a);
    }
}
