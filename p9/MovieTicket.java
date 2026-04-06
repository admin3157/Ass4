package p9;

public abstract class MovieTicket {
    public String movieName;
    public String theaterName;
    public int numTickets;

    
    abstract double calculateTotalPrice();

    
    public void confirmBooking() {
        double total = calculateTotalPrice();

        if (total == -1) return; // stop if invalid

        System.out.println("\n--- Booking Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Theater: " + theaterName);
        System.out.println("Tickets: " + numTickets);
        System.out.println("Total Price: ₹" + total);
    }
}