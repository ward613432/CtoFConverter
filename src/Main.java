import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        double celsius = 0;
        double farenheit = 0;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted in degrees F:");

            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                farenheit = (celsius * 9/5) + 32;
                valid = true;
            } else {
                System.out.println("That wasn't a valid input. Please try again.");
            }
        } while (!valid);

        System.out.printf("%-10s %.02f\n", "Degrees C:", celsius);
        System.out.printf("%-10s %.02f\n", "Degrees F:", farenheit);
    }
}