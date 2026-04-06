import p17.Temperature;
import java.util.Scanner;

public class P17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Temperature t = new Temperature();

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            t.convert(c); // Method overloading
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            t.convert(f, 1); 
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
}