import java.util.Arrays;

/**
 * Test class for the {@link GenericUtils} utility methods.
 * <p>
 * This class contains unit tests for the {@code reverse} and {@code sum} methods,
 * validating various edge cases, including different data types and special conditions.
 * </p>
 *
 * @author Bauer + Weinberger
 * @version 1.0
 */
public class GenericUtilsTest {

    /**
     * The main entry point to run all test cases.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        testReverse();
        testSum();
        System.out.println("All tests passed!");
    }

    /**
     * Tests the {@link GenericUtils#reverse(Object[])} method with different array types.
     * <p>
     * This method verifies the reversal functionality using arrays of different
     * data types, including {@code Integer} and {@code String}, as well as edge cases
     * like single-element arrays and empty arrays.
     * </p>
     *
     * @throws AssertionError if any test case fails
     */
    private static void testReverse() {
        // Test with an array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Integer array: " + Arrays.toString(intArray));
        assert Arrays.equals(intArray, new Integer[]{5, 4, 3, 2, 1}) : "Reverse method failed for Integer array";

        // Test with an array of Strings
        String[] strArray = {"A", "B", "C", "D"};
        GenericUtils.reverse(strArray);
        assert Arrays.equals(strArray, new String[]{"D", "C", "B", "A"}) : "Reverse method failed for String array";

        // Edge case: Single element array
        Integer[] singleElement = {42};
        GenericUtils.reverse(singleElement);
        assert Arrays.equals(singleElement, new Integer[]{42}) : "Reverse method failed for single element array";

        // Edge case: Empty array
        Integer[] emptyArray = {};
        GenericUtils.reverse(emptyArray);
        assert Arrays.equals(emptyArray, new Integer[]{}) : "Reverse method failed for empty array";
    }

    /**
     * Tests the {@link GenericUtils#sum(Number[])} method with different numeric types.
     * <p>
     * This method ensures that the {@code sum} function correctly calculates the total
     * of numeric arrays, including {@code Integer} and {@code Double} values. It also tests
     * special cases such as negative numbers, single-element arrays, and empty arrays.
     * </p>
     *
     * @throws AssertionError if any test case fails
     */
    private static void testSum() {
        // Test with an array of Doubles
        Double[] doubleArray = {1.5, 2.5, 3.5};
        double sumDoubles = GenericUtils.sum(doubleArray);
        System.out.println("Sum of Double array: " + sumDoubles);
        assert sumDoubles == 7.5 : "Sum method failed for Double array";

        // Test with an array of Integers
        Integer[] intArray = {10, 20, 30};
        double sumIntegers = GenericUtils.sum(intArray);
        System.out.println("Sum of Integer array: " + sumIntegers);
        assert sumIntegers == 60 : "Sum method failed for Integer array";

        // Test with negative numbers
        Integer[] negativeArray = {-5, -10, -15};
        double sumNegatives = GenericUtils.sum(negativeArray);
        assert sumNegatives == -30 : "Sum method failed for negative values";

        // Edge case: Single element
        Integer[] singleElement = {100};
        double sumSingle = GenericUtils.sum(singleElement);
        assert sumSingle == 100 : "Sum method failed for single element array";

        // Edge case: Empty array
        Double[] emptyArray = {};
        double sumEmpty = GenericUtils.sum(emptyArray);
        assert sumEmpty == 0.0 : "Sum method failed for empty array";
    }
}