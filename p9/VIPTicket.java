package p9;

public class VIPTicket extends MovieTicket {

    @Override
    double calculateTotalPrice() {
        if (numTickets <= 0) {
            System.out.println("Invalid number of tickets");
            return -1;
        }

        if (numTickets > 15) {
            System.out.println("Booking limit exceeded");
            return -1;
        }

        double total = numTickets * 450;

        if (numTickets > 10) {
            total -= total * 0.20;
        } else if (numTickets > 5) {
            total -= total * 0.10;
        }

        // Extra VIP condition
        if (numTickets > 8) {
            total -= 100;
            System.out.println("VIP Extra Discount Applied: ₹100");
        }

        return total;
    }
}