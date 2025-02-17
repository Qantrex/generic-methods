import java.util.Arrays;

/**
 * Utility class providing generic methods for array operations.
 */
public class GenericUtils {

    /**
     * Reverses the given array in place.
     *
     * @param <T>   the type of the array elements
     * @param array the array to be reversed; must not be {@code null}
     * @throws NullPointerException if {@code array} is {@code null}
     */
    public static <T> void reverse(T[] array) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at positions left and right
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all numeric values in the given array.
     * The array must contain elements that extend {@link Number}.
     *
     * @param <T>   the type of the array elements; must extend {@link Number}
     * @param array the array of numbers; must not be {@code null}
     * @return the sum of all values in the array as a {@code double}
     * @throws NullPointerException if {@code array} is {@code null}
     */
    public static <T extends Number> double sum(T[] array) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }

        double total = 0.0;
        for (T number : array) {
            // Convert each Number to a double and add to total
            total += number.doubleValue();
        }
        return total;
    }
}