package p9;

public class PremiumTicket extends MovieTicket {

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

        double total = numTickets * 300;

        if (numTickets > 10) {
            total -= total * 0.20;
        } else if (numTickets > 5) {
            total -= total * 0.10;
        }

        return total;
    }
}