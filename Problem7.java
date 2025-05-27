/**
 * Problem 7: Use methods on the given array to find the following:
 * 1. Sum of even and odd numbers
 * 2. Minimum and maximum number in the array
 * 3. Minimum and maximum number in the even array
 * 4. Minimum and maximum number in the odd array
 * 5. Average of even and odd numbers
 */
public class Problem7 {
    public static void main(String[] args) {
        int [] array = {1, 5, 7, 15, 24, 12, 14, 13, 4, 2, 23};
        
        // System.out.println("Array: {1, 5, 7, 15, 24, 12, 14, 13, 4, 2, 23}");

        System.out.println("Sum of even numbers: " + sumOfNumbers(evenArray(array)));
        System.out.println("Sum of odd numbers: " + sumOfNumbers(oddArray(array)));
        System.out.println("Minimun number in the array: " + minNumber(array));
        System.out.println("Minimum number in the even array: " + minNumber(evenArray(array)));
        System.out.println("Minimum number in the odd array: " + minNumber(oddArray(array)));
        System.out.println("Maximum number in the array: " + maxNumber(array));
        System.out.println("Maximum number in the even array: " + maxNumber(evenArray(array)));
        System.out.println("Maximum number in the odd array: " + maxNumber(oddArray(array)));
        System.out.println("Average of even numbers: " + average(evenArray(array)));
        System.out.println("Average of odd numbers: " + average(oddArray(array)));
    }

    public static int[] evenArray(int[] array) {
        int evenCount = 0;

        // Count the number of even numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;

        // Populate the even array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index++] = array[i];
            }
        }
        return evenArray;
    }
    public static int[] oddArray(int[] array) {
        int oddCount = 0;

        // Count the number of odd numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int index = 0;

        // Populate the odd array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[index++] = array[i];
            }
        }
        return oddArray;
    }

    public static int sumOfNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int maxNumber(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minNumber(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double average(int[] array) {
        if (array.length == 0) {
            return 0; // Avoid division by zero
        }
        return (double) sumOfNumbers(array) / array.length;
    }
}