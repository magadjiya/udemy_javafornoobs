package UDEMY1;

// Inches to Centimeter and Centimeter to Inches
// Value is 20 inches

public class Problem3 {
    public static void main(String[] args) {
        Problem3 function = new Problem3();

        double num1 = 20;

        double inch = inchesToCentimeter(num1);
        System.out.println(inch);

        num1 = inch;

        double val = function.centimeterToInches(num1);
        System.out.println(val);

    }

    public static double inchesToCentimeter(double value) {
        return (value * 2.54);
    }

    public double centimeterToInches(double value) {
        return (value * 0.39);
    }
}
