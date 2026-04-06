import p5.Bike;
import p5.Car;
import p5.Vehicle;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car
        Car car = new Car();
        System.out.println("Enter Car Details:");
        System.out.print("Vehicle Name: ");
        car.vehicleName = sc.nextLine();

        System.out.print("Rent Per Day: ");
        car.rentPerDay = sc.nextDouble();

        System.out.print("Number of Days: ");
        car.days = sc.nextInt();

        System.out.println("\n--- Car Details ---");
        car.showCar();

        // Bike
        Bike bike = new Bike();
        sc.nextLine(); // clear buffer

        System.out.println("\nEnter Bike Details:");
        System.out.print("Vehicle Name: ");
        bike.vehicleName = sc.nextLine();

        System.out.print("Rent Per Day: ");
        bike.rentPerDay = sc.nextDouble();

        System.out.print("Number of Days: ");
        bike.days = sc.nextInt();

        System.out.println("\n--- Bike Details ---");
        bike.showBike();

        sc.close();
    }
}