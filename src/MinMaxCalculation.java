import java.util.Arrays;

public class MinMaxCalculation {

    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 13, 3, 8, 9, 7, 19, 02, -12, 251 };

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Maximum: " + findMax(numbers));
    }
}