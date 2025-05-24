/**
 * Simple Math Tester Calculator
 * Asks User what sort of arithmetic problems they want to solve
 * Keeps quizzing them till they get 5 correct
 */

 import java.util.Random;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What Sort of Math Problems would you like to solve?\nPlease select a symbol for it (+,-,*,/)");
        String symbol = input.next();

        Random randomNumbers = new Random();

        int num1, num2, result, count = 5;

        switch (symbol) {
            case "+":
                while (count > 0) {
                    num1 = randomNumbers.nextInt(100);
                    num2 = randomNumbers.nextInt(100);
                    result = num1 + num2;
                    System.out.print(num1 + " + " + num2 + " = ");
                    int userResult = input.nextInt();
                    if (userResult == result) {
                        count--;
                        System.out.println("Correct. " + count + " tries left.");
                    } else {
                        System.out.println("Incorrect." + count + " tries left.");
                    }
                }
                break;
            case "/":
                while (count > 0) {
                    num1 = randomNumbers.nextInt(100);
                    num2 = randomNumbers.nextInt(100);
                    result = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = ");
                    int userResult = input.nextInt();
                    if (userResult == result) {
                        count--;
                        System.out.println("Correct. " + count + " tries left.");
                    } else {
                        System.out.println("Incorrect." + count + " tries left.");
                    }
                }
                break;
            case "-":
                while (count > 0) {
                    num1 = randomNumbers.nextInt(100);
                    num2 = randomNumbers.nextInt(100);
                    result = num1 - num2;
                    System.out.print(num1 + " - " + num2 + " = ");
                    int userResult = input.nextInt();
                    if (userResult == result) {
                        count--;
                        System.out.println("Correct. " + count + " tries left.");
                    } else {
                        System.out.println("Incorrect." + count + " tries left.");
                    }
                }
                break;
            case "*":
                while (count > 0) {
                    num1 = randomNumbers.nextInt(100);
                    num2 = randomNumbers.nextInt(100);
                    result = num1 * num2;
                    System.out.print(num1 + " * " + num2 + " = ");
                    int userResult = input.nextInt();
                    if (userResult == result) {
                        count--;
                        System.out.println("Correct. " + count + " tries left.");
                    } else {
                        System.out.println("Incorrect." + count + " tries left.");
                    }
                }
                break;
            default:
                System.out.println("Please input the right symbols (+,-,*,/)");
                break;
        }

        input.close();
    }
}