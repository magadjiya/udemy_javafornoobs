// Farenheit is 60
// convert faren to cels, and cels to faren

public class Problem2 {
    public static void main(String[] args) {
        double value = 60;

        double fahrenheitToCelsius = (value - 32) * 5/9;
        System.out.println(fahrenheitToCelsius);

        value = fahrenheitToCelsius;

        double celciusToFahrenheit = value * 9/5 + 32;
        System.out.println(celciusToFahrenheit);
    }
}
