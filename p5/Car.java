package p5;

public class Car extends Vehicle {
    public int days;
    public double totalRent;

    public void showCar() {
        totalRent = rentPerDay * days;

        if (days >= 7) {
            double discount = totalRent * 0.15;
            totalRent = totalRent - discount;
            System.out.println("15% Discount Applied: " + discount);
        }

        showVehicle();
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}