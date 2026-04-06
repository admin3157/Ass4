package p5;

public class Bike extends Vehicle {
    public int days;
    public double totalRent;

    public void showBike() {
        totalRent = rentPerDay * days;

        if (days >= 5) {
            double discount = totalRent * 0.10;
            totalRent = totalRent - discount;
            System.out.println("10% Discount Applied: " + discount);
        }

        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}