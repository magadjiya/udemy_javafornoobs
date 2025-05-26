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

        System.out.print("What Sort of Math Problems would you like to practice\nPlease select a symbol for it (+,-,*,/) ");
        String symbol = input.next();

        Random randomNumbers = new Random();

        int num1, num2, result, userResult, divisionRemainder, userRemainder, count = 5;

        // Validate the input symbol
        // Loop until a valid symbol is entered
        do {
            if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
                break;
            } else {
                System.out.print("Invalid input. Please enter a valid symbol (+,-,*,/): ");
                symbol = input.next();
            }
        } while (true);

        switch (symbol) {
            case "+":
                while (count > 0) {
                    num1 = randomNumbers.nextInt(10);
                    num2 = randomNumbers.nextInt(10);
                    result = num1 + num2;
                    System.out.print(num1 + " + " + num2 + " = ");
                    userResult = input.nextInt();
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
                    num1 = randomNumbers.nextInt(10);
                    num2 = randomNumbers.nextInt(10);
                    result = num1 - num2;
                    System.out.print(num1 + " - " + num2 + " = ");
                    userResult = input.nextInt();
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
                    num1 = randomNumbers.nextInt(10);
                    num2 = randomNumbers.nextInt(10);
                    result = num1 * num2;
                    System.out.print(num1 + " * " + num2 + " = ");
                    userResult = input.nextInt();
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
                    num1 = randomNumbers.nextInt(10);
                    num2 = randomNumbers.nextInt(10);

                    if (num2 == 0) {
                        num2 = randomNumbers.nextInt(10);
                    }

                    while (num1 < num2) {
                        num1 = randomNumbers.nextInt(10);
                        if (num1 >= num2) {
                            break;
                        }
                    }

                    result = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = ");
                    
                    // Get the user's answer
                    // Check if the division has a remainder
                    userResult = input.nextInt();
                    divisionRemainder = num1 % num2;

                    if (userResult == result) {
                        if (divisionRemainder != 0) {
                            System.out.print("Please enter the remainder: ");
                            userRemainder = input.nextInt();
                            if (userRemainder == divisionRemainder) {
                                count--;
                                System.out.println("Correct. " + count + " tries left.");
                            }
                        } else {
                            count--;
                            System.out.println("Correct. " + count + " tries left.");
                        }                    
                    } else {
                        System.out.println("Incorrect." + count + " tries left.");
                    }
                }
                break;
            default:
                break;
        }

        input.close();
    }
}