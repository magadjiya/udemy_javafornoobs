/**
 * Calculate the sum of even numbers between 1 - 100
 * Print the average of that
 * use both while and for loops
 */

public class Problem5 {
    public static void main(String[] args) {
        int i, sum = 0, count = 0;
        for (i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        int avg = sum / count;
        System.out.println("Sum of all even numbers under 100: " + sum + "\nThe average is " + avg);

        i = 2;
        sum = 0;
        count = 0;
        int max = 100;
        while (i <= max) {
            sum += i;
            i += 2; // Increment by 2: only even numbers
            count++;
        }
        avg = sum / count;
        System.out.println("Sum of all even numbers under 100: " + sum + "\nThe average is " + avg);
    }
}
